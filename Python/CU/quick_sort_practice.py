def swap(a,b,arr):
    if a !=b:
        temp = arr[a]
        arr[a] = arr[b]
        arr[b]=temp

def quick_sort(start,end,array):
    if start<end:
        pi = partition(start,end,array)
        quick_sort(start,pi-1,array)
        quick_sort(pi+1,end,array)

def partition(start,end,array):
    pivot_index = start
    pivot = array[pivot_index]
    while start<end:
        while start<len(array) and array[start]<= pivot:
            start +=1
        while array[end]>pivot:
            end -=1
        if start<end:
            swap(start,end,array)
    swap(pivot_index,end,array)

    return end




array =[6,3,9,5,2,8]
quick_sort(0,len(array)-1,array)
print(array)