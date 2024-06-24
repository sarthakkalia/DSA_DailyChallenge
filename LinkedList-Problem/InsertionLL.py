class Node:  ## A linked list node
    def __init__(self,data) -> None:
        self.data=data
        self.next=None

class LinkedList:
    def __init__(self):
        self.head=None
    

    def insertBeg(self,ele):
        new_node=Node(ele)  #create an object of node
        new_node.next=self.head
        self.head=new_node

    def insertEnd(self,ele):
        new_node=Node(ele)
        if self.head is None:  # if the list is empty
            self.head = new_node
            return
        temp=self.head
        while temp.next is not None:
            temp=temp.next
        temp.next=new_node
        new_node.next=None

    def insertAfter (self,ele,prev_node):
        new_node=Node(ele)
        temp=self.head
        while temp is not None and temp.data != prev_node:
            temp = temp.next
        if temp is None:
            print(f"Node with data {prev_node} not found.")
            return
        new_node.next=temp.next
        temp.next=new_node
    

    def print_node(self):
        temp=self.head
        if(temp==None):
            print("LL is Empty")
        while temp:
            print(temp.data,end=" -> ")
            temp=temp.next
        print()

if __name__=="__main__":
    list=LinkedList()
    # Beginning
    list.insertBeg(5)
    list.insertBeg(4)
    list.insertBeg(3)
    list.insertBeg(2)
    list.insertBeg(1)
    list.print_node()
    # End
    list.insertEnd(100)
    list.insertEnd(101)
    list.insertEnd(102)
    list.print_node()
    # After Specific Node 
    list.insertAfter(999,2)
    list.print_node()

    list.insertAfter(999999,1)
    list.print_node()

        