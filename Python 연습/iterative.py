#반복문: 조건에 부합하는 한 특정한 명령어를 반복적으로 수행
# 숫자 범위 표현 : range(시작 ,끝)
#continue : continue를 만났을 때 더 이상 명령어를 실행하지 않고
#            다음 반복을 진행
#beark: break를 만나면 반복문을 벗어남
i = 0
sum = 0
while i <5:
    i = i + 1
    if i % 2 ==1: #홀수
        continue
    sum = sum + i
print("합계 :", sum)