import tkinter as TK
from TestSubjects.PCBuilder.main import Window


HTimage = TK.PhotoImage(file="TestSubjects/PCBuilder/data/images/logo/hotwheels.png")

Window.geometry("200x100")
HTframe = TK.Frame(Window, bg="#eeecec", height=200, width=100, bd=2, relief="groove")
HTframe.pack(padx=20,pady=20)

HTlabel = TK.Label(HTframe, image=HTimage, bg="#eeecec")
HTlabel.pack(expand=False, fill=TK.BOTH)


def HTsection(event):
    pass

HTframe.bind("<Button-1>", HTsection)
HTimage.bind("<Button-1>", HTsection)

Window.mainloop()