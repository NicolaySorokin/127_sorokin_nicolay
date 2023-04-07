def sum_range(start, end):
    if start > end:
        start, end = end, start
    total = 0
    for num in range(start, end + 1):
        total += num
    return total
result = sum_range(10, 1)
print(result)