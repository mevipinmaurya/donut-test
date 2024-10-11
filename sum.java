def sum_of_two_digits(digit1, digit2):
    return digit1 + digit2

def main():
    # Input two digits from the user
    try:
        digit1 = int(input("Enter the first digit (0-9): "))
        digit2 = int(input("Enter the second digit (0-9): "))

        # Check if the digits are in the valid range
        if 0 <= digit1 <= 9 and 0 <= digit2 <= 9:
            result = sum_of_two_digits(digit1, digit2)
            print(f"The sum of {digit1} and {digit2} is: {result}")
        else:
            print("Please enter digits between 0 and 9.")
    except ValueError:
        print("Invalid input. Please enter numeric values.")

if __name__ == "__main__":
    main()
