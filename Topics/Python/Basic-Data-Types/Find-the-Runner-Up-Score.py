if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    listArr = list(arr)
    listArr.sort(reverse=True)
    maxNum = listArr[0]
    for num in listArr:
        if num<maxNum:
            print(num)
            break
