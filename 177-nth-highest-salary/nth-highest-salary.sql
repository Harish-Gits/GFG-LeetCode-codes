CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE nth_salary INT;
    DECLARE total_count INT;

    IF N<0 THEN RETURN NULL;
    END IF;

    -- Count distinct salaries
    SELECT COUNT(DISTINCT salary) INTO total_count
    FROM Employee;

    -- Check if N is larger than the number of distinct salaries
    IF total_count < N THEN
        RETURN NULL;
    END IF;

    -- Get the N-th highest distinct salary
    SELECT salary INTO nth_salary
    FROM (
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT N
    ) AS Temp
    ORDER BY salary
    LIMIT 1;

    RETURN nth_salary;
END