text = input("Введите текст: ")
words = text.split()
word_freq = {}
for word in words:
    if word in word_freq:
        word_freq[word] += 1
    else:
        word_freq[word] = 1
common_word = max(word_freq, key=word_freq.get)
longest_word = max(words, key=len)

print("Наиболее часто встречающееся слово: ", most_common_word)
print("Самое длинное слово: ", longest_word)
