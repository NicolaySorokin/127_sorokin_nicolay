import os
def print_docs(directory):
    for filename in os.listdir(directory):
        file_path = os.path.join(directory, filename)
        if os.path.isdir(file_path):
            print("Папка:", filename)
            print_docs(file_path)
        else:
            print("Файл:", filename)
directory = r"C:\Users\Lunatic\OneDrive\Desktop\учеба\информатика"
print_docs(directory)