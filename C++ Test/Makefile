# Remeber to Tab after :
default: run

#creates bin dir if doesn't exist yet, and compiles src
compile:
	mkdir -p bin
	g++ -o bin/Test.exe src/HelloWorldC++.cpp

#creates exe in bin dir
run: compile
	./bin/Test.exe
	
#will delete only .Exe
clean:
	rm -f bin/Test.exe

#will Delete all
bare: clean 
	rmdir bin