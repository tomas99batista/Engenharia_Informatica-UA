def binSearch(lst, x):
    """Find k such that: lst[k-1] < x <= lst[k] (not quite!)."""
    first = 0               #first index that can be result
    last = len(lst)         #last index that can be result
    while  first < last:
        mid = (first + last) // 2
        if x <= lst[mid]:
            last = mid
        else:
            first = mid + 1
    return first
