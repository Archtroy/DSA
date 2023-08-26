def DSAStack(Stack):
    inp = input("Enter Push to add new item.\n Pop to remove top item.\n Top to check top item.\n Empty to check if empty stack.\n Enter command: ")
    
    if inp == 'Push':
        newElement = input("Please enter new item: ")
        Stack.append(newElement)
    elif inp == 'Pop':
        if Stack == []:
            print("Error, Stack empty")
        else:
            Stack.pop(len(Stack)-1)
    elif inp == 'Top':
        if Stack == []:
            print("Error, Stack empty")
        else:
            print("Top item: " + Stack[(len(Stack)-1)])
    elif inp == 'Empty':
        if Stack == []:
            print("Yes, stack is empty")
        else:
            print("No,Stack is not empty")
    else:
        print("ERROR: Please enter valid response")
    return Stack

def DSAQueue(Queue):
    inp = input("Enter Enqueue to add new item.\n Pop to remove top item.\n Peek to check top item.\n Empty to check if empty stack.\n Enter command: ")
    
    if inp == 'Enqueue':
        newElement = input("Please enter new item: ")
        Queue.append(newElement)
    elif inp == 'Dequeue':
        if Queue == []:
            print("Error, Stack empty")
        else:
            Queue.pop(0)
    elif inp == 'Peek':
        if Queue == []:
            print("Error, Stack empty")
        else:
            print("Front item: " + Queue[0])
    elif inp == 'Empty':
        if Queue == []:
            print("Yes, stack is empty")
        else:
            print("No,Stack is not empty")
    else:
        print("ERROR: Please enter valid response")
    return Queue

    
def main():
    n = 1

    Stack = []
    while n == 1:
        
        DSAStack(Stack)

        print(Stack)

if __name__ == "__main__":
    main()

