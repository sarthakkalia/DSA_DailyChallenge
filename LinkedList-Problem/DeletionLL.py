class Node:
    def __init__(self,data,next=None):
        self.data=data
        self.next=next
class LinkedList:
    def __init__(self):
        self.head=None

    # push the element at beginning
    def push(self,ele):
        new_node=Node(ele)
        if self.head is None:  # if the list is empty
            self.head = new_node
            return
        temp=self.head
        while temp.next is not None:
            temp=temp.next
        temp.next=new_node

    # deletion from beginning
    def del_beg(self):
        if self.head is not None:
            self.head=self.head.next
        else:
            print("LL is empty")

    
    # deletion specific node
    def del_spc(self,ele):
        if self.head is None:
            print("List is empty")
            return
        
        if self.head.data==ele:
            self.head=self.head.next
            return

        temp=self.head
        prv_node=None
        while temp is not None:
            if temp.data==ele:
                break
            prv_node=temp
            temp=temp.next
        if temp == None:
            print('Element not found')
            return
        prv_node.next=temp.next
        temp=None



    # deletion from end
    def del_end(self):
        temp=self.head
        while temp:
            prv_node=temp
            temp=temp.next
        prv_node.next=None

    # print the node of linked list
    def printNode(self):
        if self.head==None:
            print("Ll is empty")
        temp=self.head
        while temp:
            print(temp.data,end=' -> ')
            temp=temp.next
        print()
    
if __name__=="__main__":
    head=None
    ll=LinkedList()
    ll.push(1)
    ll.push(2)
    ll.push(3)
    ll.push(4)
    ll.printNode()
    ll.del_beg()
    ll.printNode()
    ll.del_spc(4)
    ll.printNode()
    # ll.del_beg()
    # ll.del_beg()
    # ll.del_beg()
    # ll.printNode()