def count_words(s):
    s = s.strip()
    s = s[:800]
    words = s.split()
    return len(words)
text = "Я   учусь в   МПГУ"
word_count = count_words(text)
print(word_count)

