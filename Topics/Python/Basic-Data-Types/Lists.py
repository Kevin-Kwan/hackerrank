if __name__ == '__main__':
    N = int(input())
    resultList = []
    for i in range(N):
        command = input().split(" ")
        if command[0] == "insert":
            resultList.insert(int(command[1]),int(command[2]))
        elif command[0] == "print":
            print(resultList)
        elif command[0] == "remove":
            resultList.remove(int(command[1]))
        elif command[0] == "append":
            resultList.append(int(command[1]))
        elif command[0] == "sort":
            resultList.sort()
        elif command[0] == "pop":
            resultList.pop()
        elif command[0] == "reverse":
            resultList.reverse()
