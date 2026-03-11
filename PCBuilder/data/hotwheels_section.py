import tkinter as TK
from PIL import Image, ImageTk
import os


base_dir = os.path.dirname(os.path.abspath(__file__))

image_path = os.path.join(
    base_dir,
    "images",
    "logos",
    "hotwheels_section.png"
)
print(image_path)
Window = TK.Tk()
Window.title("Wish List")
Window.configure(bg="#eeecec")
Window.state("zoomed")

if not os.path.exists(image_path):
    print("Image not found:", image_path)
    
img = Image.open(image_path)
img = img.resize((100, 50))

HTimage = ImageTk.PhotoImage(img)

HTframe = TK.Frame(Window, bg="#eeecec", height=200, width=100, bd=2, relief="groove")
HTframe.pack(padx=20, pady=20)

HTlabel = TK.Label(HTframe, image=HTimage, bg="#eeecec")
HTlabel.pack(expand=False, fill=TK.BOTH)


def on_enter(e):
    HTframe.config(bg="#e6f2ff")

def on_leave(e):
    HTframe.config(bg="#eeecec")


HTframe.bind("<Enter>", on_enter)
HTframe.bind("<Leave>", on_leave)
HTlabel.bind("<Enter>", on_enter)
HTlabel.bind("<Leave>", on_leave)

Window.mainloop()