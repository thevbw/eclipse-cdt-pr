// include
#include <stdio.h>

// macro
#define PRINT(string,msg)  printf(string, msg)

//namespace
namespace MyPackage
{
	// check class
	// class
	class Hello
	{
	// protected visibility
	protected:
		// field
		int x;
		// method
		inline void setX(int X)
		{
			x = X;
		};
		// check nested pachage
		// nested namespace
		namespace MyNestedPackage {
			// check parent nested class
			// nested class
			class Y
			{	// public visibility
				public:
				// constructor
				Y();
				//  virtual destructor
				virtual ~Y();
			};
			// check derived nested class
			// derived class
			class X : public Y {
					// private visibility
					private:
					// private field
					B b;
			        
					public:
					// constructor chain
					X(int x) : yy(x) {
							cout << "In consturctor\n";
					}
			        // method declaration 
					int doNothing();
			};
		}
	};

	// check enums
	// enum without name
	enum { 
		first, 
		second, 
		third 
	}
	;
	// enum with name
	enum MyEnum { 
		f, 
		s, 
		t };

	// check variables
	// variable 
	int v;
	// unsigned long variable
	unsigned long vuLong;
	// unsigned short variable
	unsigned short vuShort;

	// check variable declarations
	// variable declaration 
	extern int evar;
	// function pointer
	static void * (*orig_malloc_hook)(const char *file, int line, size_t size);

	// check functions
	// simple function declaration
	void foo();
	// function declaration with parameters
	char* foo(int& x, 
		char**y);
	// simple function definition
	void boo(){
		int g = 0;
	};
	// check Structs
	// struct 
	struct MyStruct{
		int sint;
	};
	// typedef and elaborated types
	typedef struct MyStruct myStruct;
	// typedef 
	typedef struct{ 
		int ss; 
	} myTypedef;
	// unions
	union U{
		int U1;
	};


	// check templates
	// template function
	template<class A, typename B=C> A aTemplatedFunction( B bInstance );
	// template method
	class enclosing {
		// public visibility
		public:
		template<class A, typename B=C> A aTemplatedMethod( B bInstance );
	};
	// template class
	template<class T, typename Tibor = junk> class myarray { /* */ };
};

	// check arrays
	// arrays
	int myArray [5][];
	int main(int argc, char * argv[]) 
	{ 
	}
	

