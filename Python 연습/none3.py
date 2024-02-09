from hashlib import sha256 as SHA
import codecs

SIZE= 1024*256

def getFileHash(filename):
    sha= SHA()
    h=open(filename, 'rb')
    content= h.read(SIZE)
    while content:
        sha.update(content)
        content=h.read(SIZE)
    h.close()

def hashCheck(file1, file2):
    hashval1= getFileHash(file1)
    hashval2= getFileHash(file2)

    if hashval1 == hashval2:
        print("같습니다.")
    else:
        print("다릅니다.")

def main():
    file1='a.txt'
    file2='b.txt'

    hashval= getFileHash(file1)
    print(codecs, encode(hashval, 'hex_codec'))

    hashCheck(file1, file2)
