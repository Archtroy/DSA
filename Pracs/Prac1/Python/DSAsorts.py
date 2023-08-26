#
# Data Structures and Algorithms COMP1002
#
# Python file to hold all sorting methods
#

def bubbleSort(A):
    for pas in range(len(A) - 1):
        passFlag = 1
        if passFlag > 0:
            passFlag = 0
            for i in range(len(A) - 1 - pas):
                if(A[i] > A[i+1]):
                    temp = A[i]
                    A[i] = A[i+1]
                    A[i+1] = temp

                    passFlag = passFlag + 1

        elif passFlag == 0:
            break

def insertionSort(A):
    for nn in range(len(A)):
        ii = nn
        while ii > 0 and (A[ii-1] > A[ii]):
            temp = A[ii]
            A[ii] = A[ii-1]
            A[ii-1] = temp

            ii = ii -1

def selectionSort(A):
    for nn in range(len(A)):
        minIdx = nn
        for jj in range(nn + 1, len(A)):
            if A[jj] < A[minIdx]:
                minIdx = jj
            
        temp = A[minIdx]
        A[minIdx] = A[nn]
        A[nn] = temp


def mergeSort(A):
    """ mergeSort - front-end for kick-starting the recursive algorithm
    """
    ...

def mergeSortRecurse(A, leftIdx, rightIdx):
    ...

def merge(A, leftIdx, midIdx, rightIdx):
    ...

def quickSort(A):
    """ quickSort - front-end for kick-starting the recursive algorithm
    """
    ...

def quickSortRecurse(A, leftIdx, rightIdx):
    ...

def doPartitioning(A, leftIdx, rightIdx, pivotIdx):
    ...


