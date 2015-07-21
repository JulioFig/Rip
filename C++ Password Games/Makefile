# Remeber to Tab after :
default: compile

#creates bin dir if doesn't exist yet, and compiles src
compile: 
	mkdir -p bin
	g++ -o bin/TicTacToe.exe src/TicTacToe.cpp
	g++ -o bin/Password.exe src/Password.cpp

compile-TicTacToe:
	g++ -o bin/TicTacToe.exe src/TicTacToe.cpp

#creates exe in bin dir
run: compile
	./bin/Password.exe

run-TicTacToe: compile-TicTacToe
	./bin/TicTacToe.exe

#will delete only .Exe
clean:
	rm -f bin/Password.exe
	rm -f bin/TicTacToe.exe

bare: clean
	rmdir bin

