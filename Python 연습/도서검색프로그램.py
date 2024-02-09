books = [
    {'제목': '안드로이드앱개발', '저자': '최전산', '출판사': 'PCB', '가격': 25000, '출판연도': 2017},
    {'제목': '파이썬', '저자': '강수라', '출판사': '연두', '가격': 22000, '출판연도': 2019},
    {'제목': '자바스크립트', '저자': '박정식', '출판사': 'SSS', '가격': 23000, '출판연도': 2018},
    {'제목': 'HTML5', '저자': '주환', '출판사': '대한', '가격': 27500, '출판연도': 2012},
    {'제목': '컴파일러', '저자': '장진웅', '출판사': 'PCB', '가격': 19500, '출판연도': 2011},
    {'제목': 'C언어', '저자': '홍말숙', '출판사': '한국', '가격': 22000, '출판연도': 2010},
    {'제목': '프로그래밍언어', '저자': '현정숙', '출판사': '연두', '가격': 15000, '출판연도': 2019}
]

def add_book():
    new_book = input("추가할 도서정보를 입력하세요: ").split()
    books.append({
        '제목': new_book[0],
        '저자': new_book[1],
        '출판사': new_book[2],
        '가격': int(new_book[3]),
        '출판연도': int(new_book[4])
    })
    print_books()

def search_book():
    book_search = int(input("검색키워드(도서명:1, 저자명:2, 출판사명:3, 출판연도:4): "))
    if book_search == 1:
        keyword=input("도서명 :")
    elif book_search == 2:
        keyword=input("저자 :")
    elif book_search == 3:
        keyword=input("출판사 :")
    else:
        keyword=input("출판연도 :")

    for book in books:
        if book_search == 1 and book['제목'] == keyword:
            print(book)
        elif book_search == 2 and book['저자'] == keyword:
            print(book)
        elif book_search == 3 and book['출판사'] == keyword:
            print(book)
        elif book_search == 4 and book['출판연도'] == int(keyword):
            print(book)

def delete_book():
    title, author = input("삭제할 도서명과 저자명을 입력하세요 :").split()
    for book in books:
        if book['제목'] == title and book['저자'] == author:
            books.remove(book)
            break
    print_books()

def print_books():
        for book in books:
            print("제목:", book['제목'])
            print("저자:", book['저자'])
            print("출판사:", book['출판사'])
            print("가격:", book['가격'])
            print()


while True:
    menu = input("\n1. 도서추가\n2. 도서검색\n   - 도서명\n   - 저자명\n   - 출판사명\n3. 도서삭제\n4. 종료\n\n선택(1,2,3,4): ")
    if menu == "1":
        add_book()
    elif menu == "2":
        search_book()
    elif menu == "3":
        delete_book()
    else:
        print("프로그램을 종료합니다.")
        break