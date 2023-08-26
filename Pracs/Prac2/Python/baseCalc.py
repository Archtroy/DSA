from math import remainder


def main():
    dividend =  int(input("Enter dividend:"))

    divisor = int(input("Enter divisor:"))

    res = dividend/divisor

    array = str(res).split(".")
    quotient = int(array[0])
    remainder = float('0.' + array[1])

    print(int(divisor*remainder))
    while quotient > 0:

        res = quotient/divisor
        array = str(res).split(".")
        quotient = int(array[0])
        remainder = float('0.' + array[1])

        print(int(divisor*remainder))




    
if __name__ == "__main__":
    main()