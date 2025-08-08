def decrypt(file, shift):
    """Расшифровка Цезаря со сдвигом shift"""
    result = []
    for char in file:
        if 'a' <= char <= 'z':
            # ord() выдает значение/номер симфола в кодировке utf-8
            result.append(chr((ord(char) - ord('a') - shift) % 26 + ord('a')))
        elif 'A' <= char <= 'Z':
            # chr() возвращает символ, соответствующий номеру кодировки
            result.append(chr((ord(char) - ord('A') - shift) % 26 + ord('A')))
        else:
            # В тексте есть пробелы
            result.append(char)
    return ''.join(result)

def main():
    file_path = 'data/encoded.txt'
    with open(file_path, 'r', encoding='utf-8') as file:
        data = file.read()
    decrypted_text = decrypt(data, 13)
    print(decrypted_text)
    
if __name__ == "__main__":
    main()