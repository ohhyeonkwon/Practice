from tkinter import*
a=Tk()
c= Canvas(a, width=400, height=300)
c.pack()

id= c.create_oval(10, 100, 50, 150, fill="blue")

def move_right(event):
    c.move(id, 5, 0)
def move_left(event):
    c.move(id, -5, 0)
 

c.bind_all('<KeyPress-Left>', move_left)
c.bind_all('<KeyPress-Right>', move_right)
