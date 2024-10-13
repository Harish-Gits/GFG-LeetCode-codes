#class Node:
#    def __init__(self, data):
#        self.data = data
#        self.next = None


# your task is to complete this function
# function should return true/false or 1/0
class Solution:
    def isCircular(self, head):
        if head is None:
            return 1
        temp=head.next
        while(temp):
            if(temp==head):
                return 1
            temp=temp.next
        return 0



#{ 
 # Driver Code Starts
class Node:

    def __init__(self, data):
        self.data = data
        self.next = None


class Solution:

    def isCircular(self, head):
        # If the linked list is empty, it is considered circular
        if not head:
            return True

        # Initialize a temporary node pointing to the next node of the head
        temp = head.next

        # Iterate through the linked list until the end or until we reach the head node again
        while temp and temp != head:
            temp = temp.next

        # Returning true if temp becomes equal to head, indicating that the linked list is circular
        return temp == head


# Driver program to test above function
if __name__ == "__main__":
    t = int(input().strip())

    for _ in range(t):
        k = int(input().strip())
        input_line = input().strip()
        input_array = list(map(int, input_line.split()))

        head = None
        if input_array:
            head = Node(input_array[0])
            tail = head

            for x in input_array[1:]:
                tail.next = Node(x)
                tail = tail.next

            if k == 1 and head:
                tail.next = head

        ob = Solution()
        print("true" if ob.isCircular(head) else "false")

# } Driver Code Ends