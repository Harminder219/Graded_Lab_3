package com.greatlearning.balancedbrackets;

import java.util.Stack;

public class BalancedBrackets {

	Stack<Character> charStack = new Stack<>(); // creating stack for storing individual bracket

	private boolean checkForBalancedBrackets(String inpString) {

		for (int i = 0; i < inpString.length(); i++) {

			if (inpString.charAt(i) == '(' || inpString.charAt(i) == '[' || inpString.charAt(i) == '{') { // looking for
				// opening
				// brackets
				// and
				// storing
				// in stack

				charStack.push(inpString.charAt(i)); // push to stack

				continue;

			} else {

				if (charStack.isEmpty()) { // check for empty stack

					return false;
				}

				char getChar = charStack.pop(); // pop stack element

				if (getChar == '{') {

					if (inpString.charAt(i) == '}') {

						continue;

					} else {

						return false;

					}
				} else if (getChar == '[') {

					if (inpString.charAt(i) == ']') {

						continue;

					} else {

						return false;

					}
				} else if (getChar == '(') {

					if (inpString.charAt(i) == ')') {

						continue;

					} else {

						return false;

					}
				}

				else {

					return false;

				}

			}

		}

		return true;

	}

	public BalancedBrackets() {

		String inputString = "({[()]})";

		if (inputString.isEmpty()) {

			System.out.print("\nThe entered String is empty\n");

		}

		else {

			boolean out = checkForBalancedBrackets(inputString);

			if (out) {

				System.out.print("\nThe entered String has Balanced Brackets\n");

			} else {

				System.out.print("\nThe entered String do not contain Balanced Brackets\n");
			}

		}

	}

}
