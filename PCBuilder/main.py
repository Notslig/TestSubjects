import tkinter as TK
import pandas as PD
import sqlite3 as SQL
#import header

Window = TK.Tk()
Window.title("Wish List")
Window.configure(bg="#eeecec")
Window.geometry("1280x1920")
Window.state("zoomed")

Window.grid_rowconfigure(1, weight=1)
Window.grid_columnconfigure(1, weight=1)





Window.mainloop()