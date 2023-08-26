def facIterative ( n ):
    nFactorial = 1
    for ii in range( n, 1, -1):
        nFactorial = nFactorial * ii
    return nFactorial

def facRecursive( n ):
    if ( n == 1 ):
        n = 1
    else:
        n = n * facRecursive( n-1 )
    
    return n 

def fibIterative( n ):
    fibVal = 0
    currVal = 1
    lastVal = 0

    if (n == 0):
        fibVal = 0
    if (n == 1):
        fibVal = 1
    else:
        for ii in range(2, n):
            fibVal = currVal + lastVal
            lastVal = currVal
            currVal = fibVal
    return fibVal

def fibRecursive( n ):
    fibVal = 0

    if (n == 1):
        fibVal = 0
    elif (n == 2):
        fibVal = 1
    else:
        fibVal = fibRecursive(n-1) + fibRecursive(n-2)
    
    return fibVal

def gcd(a, b):
    a = abs(a)
    b = abs(b)
    
    if a == b:
        res = a
    elif a < b:
        res = gcd(b, a)
    else:
        res = gcd(b, (a-b))

    return res
#code templete generated through Chatgpt
def convert(number, base):
    if(number < 0):
        number = abs(number)
        negFlag = 1
    else:
        negFlag = 0
    
    if base < 2 or base > 16:
        raise ValueError("Base must be between 2 and 16")

    digits = "0123456789ABCDEF"
    if number < base:
        res = digits[number]
    else:
        res = convert(number // base, base) + digits[number % base]

    if negFlag == 1:
        res = '-'+res

    return res
#code template generated using Chatgpt

def moveDisk(src, dest, level):
    indentation = "     " * level
    print(indentation + "Recursion Level=" + str((1+level)))
    print(indentation + "Moving disk from Source " + str(src) + " to Destination " + str(dest), "\n")

def towers(n , src, dest, level):
    if (n == 1):
        moveDisk(src, dest, level)

        #print("n=", str(n), "scr=", str(src), "dest=", str(dest))
    else:
        tmp = 6 - src - dest

        towers((n-1), src, tmp, level+1)

        moveDisk(src, dest, level)

        towers((n-1), tmp, dest, level+1)

def main():
    try:
        inp = input("Select Recursion type: \n\r Type 'fac' for 'Factorial' (with a R for recursive or I for Iterative) \n\r Type 'fib' for 'Fibonacci' (with a R for recursive or I for Iterative) \n\r Type 'gcd' for Greatest Common Denomonator function \n\r Type 'conv' for converstion function \n\r Or 'han' for the Towers of Hanoi function\n")

    except ValueError:
        print("Invalid entry.")

    if inp == 'facR':
        try:
            n = int(input("Input factorial number:"))
            out = facRecursive( n )
            print(out)
        except ValueError: 
            print("Please enter a valid number.")

    elif inp == 'facI':
        try:
            n = int(input("Input factorial number:"))
            out = facIterative( n )
            print(out)
        except ValueError: 
            print("Please enter a valid number.")

    elif inp == 'fibR':
        try:
            n = int(input("Input factorial number:"))
            out = fibRecursive( n )
            print(out)
        except ValueError: 
            print("Please enter a valid number.")

    elif inp == 'fibI':
        try:
            n = int(input("Input factorial number:"))
            out = fibIterative( n )
            print(out)
        except ValueError: 
            print("Please enter a valid number.")
    
    elif inp == 'gcd':
        try:
            a =  int(input("Enter your first number:"))
        except ValueError: 
            print("Please enter a valid number.")
        try:
            b = int(input("Enter your second number:"))
        except ValueError: 
            print("Please enter a valid number.")  

        deno = gcd(a, b)

        print(deno)

    elif inp == 'conv':
        try:
            dividend =  int(input("Please enter decimal value:"))
        except ValueError: 
            print("Please enter a valid number.")
        try:
            divisor = int(input("Please enter base value:"))
        except ValueError: 
            print("Please enter a valid number.")    


        try:
            nNum = convert(dividend, divisor)
            print(nNum)
        except ValueError as e:
            print(e)

    elif inp == 'han':
        try:
            disks = int(input("Please enter number of disk: "))
        except ValueError:
            print("Please enter a valid number")
        
        towers(disks,1,3,0)     

    else:
        print("Invalid entry.")

if __name__ == "__main__":
    main()
