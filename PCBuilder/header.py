import tkinter as TK
from TestSubjects.PCBuilder.main import Window


header = TK.Frame(Window, bg="#2c2c2c", height=60)
header.grid(row=0, column=0, columnspan=2, sticky="nsew")
header.grid_propagate(False)