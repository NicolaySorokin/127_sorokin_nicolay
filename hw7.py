def search_substr(subst, st):
    if subst.lower() in st.lower():
        return "Есть контакт!"
    else:
        return "Мимо!"

#для примера
example = search_substr("Привет", "Привет, Алексей")
print(example)