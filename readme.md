


## 0 易混总结

### 1static和final

final可以修饰：属性，方法，类，局部变量（方法中的变量）

     final修饰的属性的初始化可以在编译期，也可以在运行期，初始化后不能被改变。
    
     final修饰的属性跟具体对象有关，在运行期初始化的final属性，不同对象可以有不同的值。
    
     final修饰的属性表明是一个常数（创建后不能被修改）。
    
     final修饰的方法表示该方法在子类中不能被重写，final修饰的类表示该类不能被继承。
    
     对于基本类型数据，final会将值变为一个常数（创建后不能被修改）；但是对于对象句柄（亦可称作引用或者指针），final会将句柄变为一个常数（进行声明时，必须将句柄初始化到一个具体的对象。而且不能再将句柄指向另一个对象。但是，对象的本身是可以修改的。这一限制也适用于数组，数组也属于对象，数组本身也是可以修改的。方法参数中的final句柄，意味着在该方法内部，我们不能改变参数句柄指向的实际东西，也就是说在方法内部不能给形参句柄再另外赋值）。

static可以修饰：属性，方法，代码段，内部类（静态内部类或嵌套内部类）

**static不能修饰变量**

     static修饰的属性的初始化在编译期（类加载的时候），初始化后能改变。
    
     static修饰的属性所有对象都只有一个值。
    
     static修饰的属性强调它们只有一个。
    
     static修饰的属性、方法、代码段跟该类的具体对象无关，不创建对象也能调用static修饰的属性、方法等
    
     static和“this、super”势不两立，static跟具体对象无关，而this、super正好跟具体对象有关。
    
     static不可以修饰局部变量。

static final和final static没什么区别，一般static写在前面。

static修饰的属性强调它们只有一个，final修饰的属性表明是一个常数（创建后不能被修改）。static final修饰的属性表示一旦给值，就不可修改，并且可以通过类名访问。

static final也可以修饰方法，表示该方法不能重写，可以在不new对象的情况下调用。

static final修饰的属性表示一旦给值，就不可修改，并且可以通过类名访问。 

## 1.概述

- Java语言的前身是**Oak**语言

- Java语言特点：

  - 简单性：去掉了C和C++中最容易出错的**指针**和最难理解的**多重继承**等技术，通过**垃圾自动回收机制**简化了程序内存管理，**统一了各种数据类型在不同操作系统平台上所占内存大小**。
  - 平台无关性：编译后转换为字节码，可以跨平台运行
  - 面向对象：完全的面向对象语言
  - 分布式：程序和数据可分散在网络的不同主机上运行和存储
  - 安全性：
    - 语言定义：取消指针，自动回收垃圾
    - 字节码检查阶段：限制对象的存储权限，系统堆栈溢出，参数类型一致性
    - 程序执行阶段：限制Java小程序的不正当使用
  - 多线程
  - 解释编译两种执行方式
  - 丰富的API文档和类库

- Java程序运行过程

  Java源程序 （.java），字节码(.class)

- Java虚拟机：软件方式实现一台假想机，JVM有自己想象中的硬件
- JRE：是Java执行环境，包括Java SE API与JVM
- JDK：(J包括了javac、java、javadoc等工具程序，对于要开发Java程序的人，必须安装JDK。JDK本身包含了JRE。
- Java程序分类：
  - Java应用程序：完整的、可独立运行运行的Java程序。必须包含一个main()方法。
  - Java小应用程序（Applet）：嵌入在HTML页中，靠Web浏览器激活Java虚拟机来运行的程序，在客户端执行
  - 服务器端小程序(Servlet)：以Web服务器为容器，靠Web服务器来加载和运行。在服务器端执行
  - Javabean：本身不能独立运行，必须以Java应用程序、Applet、Servlet或者Javabean为容器才能执行。分为可视化与非可视化两种。

- 开发Java程序步骤：
  - 编辑：采用编辑器编写Java源程序(.java)。
  - 编译：Java源程序经过Java编译器的编译可以生成Java字节码文件(.class)。
  - 运行：Java字节码能够在JVM上执行，JVM机通过解释器执行Java字节码文件。



## 2标识符和数据类型

### 2.1Java程序结构

#### 2.1.1简介

- 面向过程语言：以**“数据结构+算法”**程序设计范式构成的程序设计语言，称为面向过程语言。主要的面向过程语言有C、FORTRAN、COBOL、ALGOL、PASCAL、BASIC等。
- 面向对象语言：以**“对象+消息”**程序设计范式构成的程序设计语言，称为面向对象语言。比较流行的面向对象语言有Simula、Smalltalk、Java、Ruby等。
- 两者兼有语言：C++、Python。

#### 2.1.2Java程序结构

- package语句：可以没有，如果有必须放在文件开始地方。按照包组织类
- import语句：可以没有，也可以有多个。如果有import语句的话，必须放在所有类定义之前。
- public型的class定义：每个文件中最多有一个。
- class定义：每个文件中包含的类定义的个数没有限制。
- interface定义：每个文件中包含的接口定义个数没有限制。

### 2.2 基本语法单位

- 换行符及回车都可以表示一行的结束，它们可以被看作是空白。

- 空格键、水平定位键(tab)也是空白。

- 注释：

  ```java
  //在一行注释
  /*一行或多行注释 */
  /**文档注释 */
  
  ```

- **语句**是Java中最小执行单位。一个语句可以写在连续的若干行内

- 关键字不可以作为标识符

- Java标识符使用**Unicode**码(16位)，头128个字符与标准的ASCII字符集是一致的

- 标识符是以**字母、下划线( _ )或美元符( $ )**开头，由**字母、数字、下划线( _ )或美元符( $ )组成**的字符串，区分大小写，长度一般没有限制，不能有其他符号，也不能插入空格

### 2.3 命名约定

- 类：类名一般为名词，含有大小写，每个字的**首字母大写**。例如，HelloWord, Customer等。
- 接口：接口是一种特殊的类，命名约定与类名相同。
- 方法：方法名应为动词或动名词，含有大小写，**首字母小写**，其余各字的首字母大写。例如，getName, setName, query, raiseSalary等。
- 常量：**全部为大写字母**，字与字之间用**下划线**分隔，对象常量可以使用**混合大小**写。例如，BLUE_COLOR。
- 变量：所有实例变量、类变量和全局变量都使用混合大小写，**首字符为小写，后面的字首用大写**，作为字间的分隔符。变量名中最好不要使用下划线和美元符号。例如，balance，orders, byPercent等

### 2.4 基本数据类型

![image-20191101190714017](D:\A personal date\GitHub\Java_learning\image-20191101190714017.png)

#### 2.4.1.1 boolean

- boolean有两个常量值:false和true，它们全是小写字母，在计算机内用**8位**表示。
- Java是一种严格的类型语言，它**不允许数值类型和布尔类型之间进行转换**。

#### 2.4.1.2 char

- 一个char表示一个Unicode字符，其值用16位无符号数表示
- char类型的常量值必须用一对单引括号(’ ’)括起来

#### 2.4.1.3 整数类型

![image-20191101191102752](D:\A personal date\GitHub\Java_learning\image-20191101191102752.png)

- 整数类型常量可以用十进制、八进制或十六进制形式表示。八进制以0开头，16进制以0x开头
- 默认为int型，若想表示long型**必须加l**

#### 2.4.1.4 浮点型

![image-20191101191710694](D:\A personal date\GitHub\Java_learning\image-20191101191710694.png)

- 整型0/0会报错，浮点型不会
- 默认为double，若想用float**必须加f**

#### 2.4.2 类型转换

- 自动转换：位数少的类型转换向位数多的类型转换为自动转换
- 强制转换：
  - 位数多的类型向位数少的类型进行转换需要进行强制转换。
  - 高级类型(位数较多的数据类型)转换为低级类型(位数较少的数据类型)时，截断高位内容，因此会导致精度下降或数据溢出。



### 2.5 类与对象的初步介绍

#### 2.5.1 面向对象语言的初步发展

- Simula
  - 面向对象技术最早是在编程语言Simula中提出的，Simula语言是Simula I和Simula 67两个语言的统称。**Simula 67语言是被公认的最早的面向对象语言**，**但它的实现不是很完整。**
  - Simula虽然最早提出对象的概念，但因为其自身复杂，比较难学，而没有大规模流行。但Simulat提出的面向对象的概念对程序语言后继的发展产生了巨大和深远的影响。
- Smalltalk
  Smalltalk是公认为历史上第二个面向对象的程序语言，而且是**第一个完整实现了面向对象技术的语言**。

- C++:是**第一个大规模使用**的面向对象语言

#### 2.5.2 面向对象概述

##### 2.5.2.1 基本概念

- 对象：对象是对现实世界中个体或事物的抽象表示，是它的**属性(数据)和相关操作(方法)的统一封装体**。
- 类：类用于表示某些对象的共同特征(属性和操作)，对象是类的实例。

##### 2.5.2.2 面向对象特征

- 封装：将数据及对数据的操作捆绑在一起成为类，就是封装。
- 继承：将一个已有类的属性和方法保留，并加上自己特殊的属性和方法，从而构成一个新类，就是继承。原来的类是父类，新类是子类，子类继承或派生于父类。
- 多态：在一个类或多个类(具有父子关系)中，可以让多个方法使用同一个名字，从而具有多态性。

##### 2.5.2.3 面向对象语言五个基本特征

- 万物皆对象
- 程序是对象的集合，他们通过发送消息来告诉彼此所要做的
- 每个对象都有他们自己的有其他对象所构成的存储。即可以通过创建包含现有对象的包的方式来创建新类型的对象  
- 每个对象都拥有其类型。
- 某一特定类型的所有对象都可以接收同样的消息

##### 2.5.2.4 与类有关的关键字

- 限定访问权限的修饰符
  - public：用public修饰的成分表示公有的，它可以被其它**任何对象**访问。
  - private：类中限定为private的成员只能被**这个类本身**访问，在类外不可见。
  - protected：用该关键字修饰的成分是受保护的，只可以被**同一包及其子类的实例对象**访问。
  - 没有修饰：如果没有访问修饰符，则表示friendly，相应的成分可以被**所在包中的各类**访问。

| **类型**         | **无修饰符** | **private** | **protected** | **public** |
| ---------------- | ------------ | ----------- | ------------- | ---------- |
| 同一类           | 是           | 是          | 是            | 是         |
| 同一包中的子类   | 是           | 否          | 是            | 是         |
| 同一包中的非子类 | 是           | 否          | 是            | 是         |
| 不同包中的子类   | 否           | 否          | 是            | 是         |
| 不同包中的非子类 | 否           | 否          | 否            | 是         |

- 存储方式修饰符---static
  - static既可以修饰类的属性(静态属性)，也可以修饰类的方法(静态方法)。
  - 静态成员与类相对应，它可以被类的**所有对象**共享。
  - 静态成员可以使用类名直接访问，也可以使用对象名进行访问。、
  - 静态方法不需要实例化即可调用，不能有this，不能访问非静态成员变量和非静态方法，但是非静态成员变量和非静态方法可以访问静态方法。
  - 例子： 静态方法与变量

- 与继承有关的关键字
  - extends：继承关系用extends表示。
  - final：用final修饰的类不能再派生子类，它已达到类层次中的最底层。修饰的方法不能被重写。final 修饰变量，则该变量的值只能赋一次值，即常量
  - abstract：用abstract修饰的类或方法，表示被修饰的成分是抽象的。抽象方法只须给出原型说明，方法体是空的，含有抽象方法的类必须说明为抽象类。不能创建抽象类的实例。
  - this：指代本类。
  - super：指代父类。

#### 2.5.3 创建对象

- Java对类类型变量的内存分配步骤：
  - 对象引用：在内存中为其建立一个引用，并置初值null，表示**不指向任何内存空间**。
  
  - 对象实例化：用new申请相应的内存空间，内存空间的大小依class的定义而定，并将该段内存的首地址赋给刚才建立的引用。
  
  - Java把说明为class类型的变量看作是引用
  
  - 例子见 引用理解
  
    

### 3表达式与流程控制

#### 3.1 表达式

- 表达式：由**运算符和操作数**组成，对操作数进行运算符指定的操作，并得出一个结果

##### 3.1.1操作数

- 常量：

  - 在Java语言中，主要是利用final关键字来进行常量定义，当常量被定义后，是不允许修改的。
  - final和static同时使用：多个对象中的值是相同的。只加final由于初始化情况不同不同对象中的值可能也不相同。

- 变量：

  - 变量是存储数据的基本单元，它可以用作表达式中的操作数，变量在使用前先要说明

  - 初始化：若不给定值，系统按照如下值进行初始化

    | **类型**     | **初始值**     |
    | ------------ | -------------- |
    | byte         | (byte)0        |
    | short        | (short)0       |
    | int          | 0              |
    | long         | 0L             |
    | float        | 0.0f           |
    | double       | 0.0            |
    | char         | ‘\u0000’(null) |
    | boolean      | false          |
    | 所有引用类型 | null           |

  - 作用域：

    - 类中定义成员变量的作用域是整个类。
    - 方法中定义的局部变量的作用域是从该变量的说明处开始到包含该说明的语句块结束处，块外是不可使用的。
    - 块内说明的变量将屏蔽其所在类定义的同名变量。但是同一块中如果定义两个同名变量则将引起冲突。

##### 3.1.2 运算符

- 算术运算符

- 关系运算符

- 逻辑运算符

- 位运算符

  - 位运算符用来对二进制位进行操作，包括按位取反(~)、按位与(&)、按位或(|)、异或(^)、右移(>>)、左移(<<)及无符号右移(>>>)，
  - 位运算只能对整型和字符型数据进行操作。
  - **注：**计算机中使用的是补码存储！！！
  - 负数的补码：符号位为1，其余位为该数绝对值的原码按位取反，然后整个数加1。
  - 整数的补码：与原码相同。每一位都要与

- 条件运算符：

  - 表达式?语句1:语句2；
  - 表达式得到一个逻辑值，根据该值得真假决定执行什么操作。如果为真(true)，执行语句1，否则执行语句2 

- 转换原则：低可以转高，但高不可以转低

  

##### 3.1.3 数学函数

Math.random(). 返回0.0到1.0之间双精度的一个随机数

得到一个[min,max)之间的数;

```java
public static int getRandomInt(int min, int max) {
        return (int)(Math.random()*(max-min)+min); //不含最大值，含最小值
    }
```

#### 3.2 控制流

##### 3.2.1语句

- 语句是Java的最小执行单位
- 分为简单语句和复合语句，复合语句就是花括号括起来的语句组，也称作快

##### 3.2.2 控制语句

- if语句
- switch语句
  - 表达式的计算结果必须是byte, short, int, char型或枚举类型。
  - Java规定switch语句不允许使用浮点型或long型表达式。
  - default语句可选

##### 3.2.3 循环语句

- for语句：for循环语句适用于明确知道重复执行次数情况

  for循环的执行流程：
  1)第一次进入for循环时，对循环控制变量赋初值；
  2)根据判断条件的内容检查是否要继续执行循环，如果判断条件为真，继续执行循环，如果条件为假，则结束循环执行下面的语句。
  3)执行完循环体内的语句后，系统会根据循环控制变量的增减方式，更改循环控制变量的值，再回到步骤2重新判断是否继续执行循环。

- while循环结构语句

- do while循环结构语句：它总是先执行一次循环体，然后判断条件表达式的值是否为真，若为真，则继续执行循环体；否则循环执行结束

##### 3.2.4转移语句

- break
  - break语句可用于switch语句，for、while及do等循环语句和块语句中。
  - 在switch语句及循环语句中，break的语义是跳过本块中余下的所有语句，转到块尾，执行其后的语句。
  - 在循环语句中，可以用break语句强行退出循环，继续执行循环体外的下一个语句，如果break出现在嵌套循环中的内循环，则break语句**只会退出当前一层循环**。
  - **标签：**在块中和标号配合使用，语法格式为：break 标号；**其语义是跳出标号所标记的语句块，继续执行其后的语句。**
- continue
  - 立即结束当次循环而执行下一次循环
  - continue语句可以和标号一起使用，其语法格式为：continue 标号; 它立即结束标号标记的那重循环的当次循环，开始执行下一次循环

### 4 数组、枚举、字符串、容器

#### 4.1 数组

- Java将数组作为对象来处理

##### 4.1.1 一维数组的定义

```java
type arrayName[];
Type[] arrayName;
```

- 定义并不会为数组元素分配内存，因此[] 中不需要指出数组长度。
- 这只是个引用，并不会真正分配内存空间。

##### 4.1.2 一维数组的创建

非为静态初始化和动态初始化

- 静态初始化：定义数组的同时对数组元素进行初始化。
- 动态初始化：使用运算符new为数组分配空间，数组说明的方括号中的数字表示数组元素个数。

```java
String[] names=new String[3];
names[0]=“Zhang”; 
names[1]=“Li”;
names[2]=“Wang”;
//等价于
String names[]={“Zhang”, “Li”, “Wang” };

```

##### 4.1.3复合类型数组

复合类型数组使用运算符new为只是为数组本身分配空间，并没有对数组的元素进行初始化。对于复合类型的数组，需要经过两步进行空间分配：

```java
	type arrayName[]=new type[arraySize];//创建数组本身

	arrayName[0]=new type(paramList);
    arrayName[1]=new type(paramList);
    ……
    arrayName[arraySize-1]=new type(paramList); //创建各个数组元素
```

##### 4.1.4 数组比较

数组属于引用型变量，因此两个相同类型的数组如果具有**相同的引用**，它们就有完全相同的元素。

即引用相等表示他们指向同一个数组。

##### 4.1.5 数组的遍历

- 循环遍历

- toString()方法遍历

  ```java
  Arrays.toString(arrayName);
  ```

##### 4.1.6 多维数组

```java
//定义
int intarray [][];
int	[][] intarray;

//动态初始化
//方法1：直接为每一维分配空间
int[][] intArray=new type[arraylength1][arraylength2];
//方法2：多维数组可以从高维起，分别为每一维分配内存。
type arrayN[][]=new type[arraylength1][];
arrayN[0]=new type[arraylength2];
arrayN[1]=new type[arraylength2];
…
arrayN[arraylenth1-1]=new type[arraylength2];
//即除了最后一维可以不给定长度，其他必须给定长度，且可以生成不同长度的低维数组
```

##### 4.1.7 数组复制

System

```java
public static void arraycopy(sourceArray, //源数组
                             int index1, //起始位置
                             copyArray, //目标数组
                             int index2,//目标数组起始位置
                             int length)//长度
    //如果放不下报异常
```

```java
Arrays类
public static type[] copyOf(type[] original, int newLength)
//生成一个内容为orginal，长度为newLength的新数组
```

```java
public static type[] copyOfRange(type[] original, int from, int to)
//将参数original指定的数组中从索引from至to-1的元素复制到一个新数组中，并返回这个新数组
```



#### 4.2 枚举

```java
enum 枚举名
{
      常量列表
}
```

![image-20191103145701694](D:\A personal date\GitHub\Java_learning\image-20191103145701694.png)

#### 4.3 字符串

- String为不变字符串，StringBuffer为可变字符串
- 常用方法：
  - length()：返回字符串中的字符个数。
  - charAt(int index)：返回字符串中index位置的字符。
  - toLowerCase()：将当前字符串中的所有字符转换为小写形式。
  - toUpperCase()：将当前字符串中的所有字符转换为大写形式。
  - subString(int beginIndex)：截取当前字符串中从beginIndex开始到末尾的子串。
  - subString(int beginIndex, int endIndex)：截取当前字符串中从beginIndex开始到endIndex结尾的子串。
  - replace(char oldChar, char newChar)：将当前字符串中出现的所有oldChar转换为newChar。

#### 4.4 容器

- Collection接口：存放独立元素的序列。

- Map接口：存放key-value型的元素对。

- 常用的容器：
  
  - Vector
  
  - LinkedList：其数据结构采用的是链表，此种结构的优势是删除和添加的效率很高，但随机访问元素时效率较ArrayList类低。
  - ArrayList：其数据结构采用的是线性表，此种结构的优势是访问和查询十分方便，但添加和删除的时候效率很低。
  - HashSet：不允许其中存在重复的元素，无法添加一个重复的元素，利用Hash函数进行了查询效率上的优化。
  - HashMap：提供了key-value的键值对数据存储机制，可以十分方便的通过键值查找相应的元素，而且通过Hash散列机制，查找十分方便。

#### 4.4.1 迭代器

- boolean hasnext(); //检查序列中是否还有元素
- Object next(); //获得序列中的下一个元素
- void remove(); //将迭代器中当前元素删除



## 5 对象和类进阶

### 5.1 抽象数据类型

- 是指基于一个逻辑类型的数据类型以及这个个类型上的一组操作。
- Java只“按值”传送自变量，即方法调用不会改变自变量的值。
- 重载方法名：Java允许对多个方法使用同一个方法名，这就是方法名的重载。方法重载允许Java在同一个类中定义相同的方法名，但需要具有不同的参数表（参数个数或者参数名不同）。

### 5.2 对象的构造和初始化

- 构造方法：
  - 构造方法的名字与类名相同。
  - 没有返回类型。
  - 通常要说明为public类型，即公有的。
  - 可以按需要包含所需的参数列表。
  - **构造方法不能继承。**

###  5.3 this引用

- this引用对象自身，常用在引用隐藏数据域，调用构造方法。
- static方法中不能出现this

### 5.4 子类

- **“is a”关系**

- extends关键字，object类为所有类的父类

- 继承父类的属性在子类中不用定义，可以直接使用。

- Java只允许单继承

- 多态性：同一名字的若干个方法，有不同的实现(放方法体中的代码不一样)。通过重载或者重写实现（final 方法不能被重载或者重写）

- **动态绑定：**假设对象o是类C1,C2,…,Cn-1和Cn的实例，其中，C1是C2的子类，C2是C3的子类，…，Cn-1是Cn的子类，如果对象o调用一个方法m，Java虚拟机依次在类C1,C2,…,Cn-1,Cn中查找方法m的实现，直到找到为止。**即从子类逐个向父类寻找，调用找到的第一个**

- 异类集合：异类集合是由不同质内容组成的集合，也就是说，集合内所含元素的类型可以不完全一致。

  ```java
  A[] abcdef=new A[7];//设置类型时必须为父类的
  //此时只是一个数组，里面7个A引用，值为null
  abcdef[0]=new A();
  abcdef[1]=new B();
  abcdef[2]=new C();
  abcdef[3]=new D();
  abcdef[4]=new E();
  for(int i=0;i<5;i++)
  	{        
  		abcdef[i].printf();
  	}
  
  ```

- 由于类的多态性，类的变量既可以指向本类实例，又可以指向其子类的实例。在程序中，有时需要判明某个引用到底指向哪个实例，这可以通过**instanceof**运算符来实现。

  ```java
  class A
  {
      void printf()
      {
          StdOut.println("A");
      }
      void printf(A e)
      {
          if (e instanceof B)
          {
              StdOut.println(e.getClass()+"is b");
          }
          else if(e instanceof C)
          {
              StdOut.println(e.getClass()+"is c");
          }
  
      }
  
  }
  
  //main函数
  A a=new A();
  a.printf(b);
  a.printf(c);
  ```

  即父类中的一个方法接受他的不同的子类的成员，然后判断到底是哪个子类的

- 转换对象：Java允许使用对象之父类类型的一个变量指示该对象，称为转换对象，但不允许子类指向父类。

### 5.5 方法重写

- 子类重写父类方法的情况：

  - 子类要做与父类不同的事情；
  - 在子类中取消这个方法；
  - 子类要做比父类更多的事情。

- 如果子类已经重写了父类中的方法，但在子类中还想使用父类中被隐藏的方法，可以使用super关键字。

- 方法重写的规则

  - 重写方法的允许访问范围不能小于原方法。
  - 重写方法所抛出的异常不能比原方法更多

- **父类构造方法调用**  

  - Java要求一个父类的对象要在子类运行前完全初始化。

  - super关键字也可以用在构造方法中，其功能为调用父类的构造方法。

  - **如果在子类的构造方法的定义中没有明确调用父类的构造方法，则系统在执行子类的构造方法时会自动调用父类的构造方法(无参数的构造方法)。**

  - **如果在子类的构造方法的定义中调用了父类的构造方法，则调用语句必须出现在子类构造方法的第一行。**

    ```java
    public class TestD
    {
        public static void main(String[] args)
        {
            method(new B());
            method(new A());
        }
    
        public static void method(A a)//只是生成引用，跟调用谁的函数和构造函数无关
        {
            a.print();
        }
    }
    
    class A
    {
        int data;
    
        public A()
        {
            add(2);
        }
    
        public A(int k)
        {
            add(k);
        }
    
        public void add(int i)
        {
            data += i;
        }
    
        public void print()
        {
            System.out.println("data=" + data);
        }
    }
    
    class B extends A
    {
        public B()
        { 
            //super(1);
            add(1);
    
        }
    
        public void add(int i)
        {
            data += i * 3;
        }
    }
    ```

    method(new B())详解：

    B()继承A，故先隐式调用A的无参构造函数，执行add(1)，此时执行的是重写的add（1），故data=2*3=3；然后再执行add（1），结果为9，若加上super（9），则调用有参构造函数。

    method(new A())详解：

    直接调用A的构造函数和add函数。

    **即：**new的是谁就调用谁的方法，即使是在子类中调用父类的构造函数也是调用重写的方法（动态绑定）

  

### 5.6 Java包

- 一个Java源代码文件称为一个编译单元。
- Java语言规定，一个编译单元中只能有一个public类，且该类名与文件名相同。
- 编译单元中的其它类是该public类的支撑类。
- 经过编译，编译单元中的每个类都产生一个.class文件。
- Java的工作程序是一系列的.class文件，Java解释器负责寻找、加载和解释这些文件。
- 包是类的容器，包的设计人员利用包来划分名字空间，用于分隔类名空间，以避免类名冲突。
- 通常包名中全部用小写字母。

### 5.7 类成员

如果类中包含类成员(类变量/类方法)，系统只在实例化该类的第一个对象的时候，为类成员分配内存，以后再生成该类得实例对象时，将不再为类成员分配内存，不同对象的类变量将共享同一内存空间。

#### 5.7.1 类变量（静态变量）与类方法（静态方法）

- 被所有的类成员所共享，不依赖于实例。
- 类方法不允许使用this和非静态成员变量。

### 5.8 关键字final

- final可以修饰类或类的成员(成员变量或成员方法)。
- 一个方法被定义为final，则不能被重写，
- 如果一个类被定义为final，它不能有子类。
- 被标记为final的变量称为终极变量。终极变量是一个常量，企图改变终极变量的取值将会引起变异错误。

### 5.9 抽象类

- 可以通过关键字abstract把一个类定义为抽象类。

- 在抽象类中，每一个未被定义具体实现的方法也标记为abstract，称为抽象方法。

- 抽象类不能被直接实例化，他的子类可以。

- 抽象类可以包含抽象方法和非抽象方法，反之，不能在非抽象类中声明抽象方法，即只有抽象类才能具有抽象方法。

  

### 5.10 接口

- 接口允许创建者规定一个类的基本形式，包括方法名、自变量列表以及返回类型，但不规定方法主体。

- 在接口中所有的方法都是抽象方法体。

- Java允许一个类实现(implements)多个接口，从而实现比多重继承更加强大的能力。

- **接口也具有数据成员与方法，但数据成员一定要赋初值，且此值不能再更改，而方法必须是“抽象方法”。**

  ```java
  interface Storage
  {
      int num = 10;
  
      void setNum(int a);
  
      void setNum();
  
      void printf();
  }
  
  public class Interface implements Storage
  {
  
      int a;
      @Override
      public void setNum(int a)
      {
          this.a=a;
      }
  
      @Override
      public void setNum()
      {
          a=num;
      }
  
      @Override
      public void printf()
      {
          StdOut.println(a);
      }
      public static void main(String[] args)
      {
          var t=new Interface();
          t.printf();
          t.setNum();
          t.printf();
          t.setNum(23);
          t.printf();
      }
  } 
  ```

  

### 5.11 内部类

#### 5.11.1 成员类

- 成员类是在封装类或封装接口中作为成员声明的类。

- 成员类包含非静态成员类和静态成员类。

- 非静态成员类：

  - 非静态成员类中**不能定义静态变量和方法**。
  - 非静态成员类可以访问封装类的所有成员。
  - 在非静态成员类中访问封装类的成员时，若封装类的成员与成员类的成员不重名，则可以直接用成员名进行访问；若封装类与成员类的成员的成员重名，访问封装类实例成员的语法为：封装类类名.this.封装类实例成员名;
  - 在封装类之外创建非静态成员类实例时，**需要先创建封装类的实例**，然后使用以下语法创建非静态成员类实例：封装类类名.非静态成员类类名 实例变量名=封装类实例成员名.new 非静态成员类类名;

- 静态成员类：

  - 静态成员类中既可以**定义静态成员，也可以定义非静态成员**。

  - 静态成员类中能直接访问封装类的所有静态成员，但**不能直接访问封装类的非静态成员**。

  - 在静态成员类中访问封装类的成员时，若封装类的成员与成员类的成员不重名，则可以直接用成员名进行访问；若封装类与成员类的成员的成员重名，访问封装类静态成员的语法为：封装类类名.封装类静态实例成员名;

  - 在封装类之外创建静态成员类实例的语法为：封装类类名.静态成员类类名 实例变量名= new 封装类类名.静态成员类类名;**不需要先创建封装类的实例。**

  - 在封装类之外访问静态成员类的静态成员时，需要用封装类的名称作为前缀，语法如下：封装类类名.静态成员类类名.静态成员名;

    ```java
    public class TTest
    {
        static class fuck
        {
            static void print()
            {
                StdOut.println("我是静态成员类");
            }
        }
    
        public static void main(String[] args)
        {
            TTest.fuck hehe=new TTest.fuck();
            hehe.print();
            TTest.fuck.print();
        }
    }
    ```

    

#### 5.11.2 *局部类*

- 局部内部类是在**封装类的方法中**定义的内部类，与局部变量类似，其作用域是定义它的代码块。
- 局部类的类名**不能与其封装类重名**。
- 局部类可以是abstract和final型，**访问修饰符只能是缺省的**，不能是public、private或protected。
- 局部类中**不允许包括静态成员(变量和方法)**。
- 在局部类中**只能访问它所在方法中的final型变量，不能访问非final型的变量**。
- 不能在封装类之外创建局部类的实例。
- 在局部类中可以访问封装类的成员，如果封装类成员与局部类成员重名，实例成员：封装类类名.this.封装类实例成员名，静态成员：封装类类名.封装类实例成员名;

#### 5.11.3 匿名类

- 匿名类是指没有名称的类，这个类实现的功能比较简单，或者在程序中只使用一次，就可以用匿名类的方式创建这个类的实例
- new 匿名类类名或接口名(){
          类体;
  }
- 匿名类必须是一个具体的对象，**不允许是abstract的，也不可以是static**。
- 匿名类本身没有名字，所以**没有构造方法**，只能用super关键字调用其父类的构造方法。
- 匿名类**只能是final型的，其中包括的所有变量和方法都是final型的**，即无法被继承。

#### 5.11.4 成员接口

- 成员接口是指在封装类或封装接口中声明的接口。
- 当一个接口被嵌套在一个类中时，该接口修饰符可以是public、private和缺省的，private接口只能在封装类的内部实现和使用。
- **当一个接口被嵌套在一个接口中时，成员接口自动拥有封装接口访问范围，可以在外部加以实现。**



### 5.12 范型（类似typename）

修饰符] [static] [final] [abstract] class 类名<类型参数表> 
                               [extends 父类名] [implements 接口名]{
         类体;
}

- 如果一个类或接口包含了一个或多个类型变量，则称该类或接口为范型类或范型接口
- 参数列表可以包含若干个表示类型的参数，多个参数之间用逗号分隔。
- 类型参数可以使用任何字符串，通常约定使用大写字母，
- 创建范型类的具体实例，必须用具体的数据类型来替换类定义中的类型参数表中的范型类型并用尖括号括起
- 有界类型参数：在特定的应用中，可能希望**定义的范型是某个类或其子类类型**，而不是全部的子类类型，这种有所限制的范型称为有界范型。定义：<T extends 类名或接口名>;

## 6.异常

- 异常(Exception)是正常程序流程所不能处理或没有处理的异常情况或异常事件
- 按照异常在**编译时是否被检测**来分，异常可分为受检异常(Checked Exception)与非受检异常(Unchecked Exception)。非受检异常：在编译时不能被Java编译器检测到。非受检异常包括运行yan时异常(Runtime Exception)和错误(Error)。
- 根据**异常的严重性**，异常又可以分为程序可以处理的异常和错误异常。
  - 程序可处理异常：程序可处理的异常是非致命性的，通过某种修正后程序还能继续执行，这类异常也称为例外。可处理异常借助于程序员的干涉是可以恢复的。
  - 错误异常：错误异常是致命性的，不能简单地恢复执行。



### 6.1 基本概念

- 异常对象：在一个方法运行过程中，如果发生了异常，称程序产生了一个异常事件，相应地生成异常对象。这个对象中包含了该异常必要的详细信息，包括所发生的异常事件类型及异常发生时程序的状态。
- 抛出异常：我们将生成异常对象并把它提交给运行时系统的这一过程称为抛出(throw)一个异常。
- 捕获：异常发生时，Java运行时系统从生成对象的代码块开始进行回溯，沿方法的调用栈逐层回溯，寻找相应的处理代码，直到找到包含相应异常处理的方法为止，并把异常对象交给方法处理，这一个过程为捕获。

- 异常的处理借助于调用堆栈按先近后远的原则进行。

### 6.2 异常处理

- 异常处理：对所发生的异常进行的处理。

- 异常处理的方式有两种：**捕获异常和转移异常。**

  - 捕获异常：通过try-catch-finally结构处理，格式如下

    ```java
    try{
             //此处为抛出具体异常的代码
         }catch(ExceptionType1 e){
             //抛出ExceptionType1异常时要执行的代码
         }catch(ExceptionType2 e){
              //抛出ExceptionType2异常时要执行的代码
          } 
          ……
          catch(ExceptionTypek e){
               //抛出ExceptionTypek异常时要执行的代码
          }finally{
               //必须要执行的代码
          }
    }
    
    ```

  - 转移异常：程序不在当前方法内处理异常，而是把异常抛出到调用方法中。

    ```java
    <访问权限修饰符><返回值类型><方法名>(参数列表) throws 异常列表{
         方法体；
    }
    ```

    ![image-20191109203437778](D:\A personal date\GitHub\Java_learning\image-20191109203437778.png)

- 	public String toString()//使用getMessage()的结果返回类的串级名字。

  

## 7Swing

### 7.1 AWT与Swing

- AWT和Swing区别
  - **AWT**是基于本地方法的C/C++程序，其**运行速度比较快**，**Swing**是基于AWT的Java程序，其**运行速度比AWT要慢。**
  - AWT的控件在不同的平台可能表现不同，而**Swing在所有平台表现是一致的。**
  - **Swing要比AWT拥有更多的功能**。由于Swing是在AWT基础上扩展而来的，因此Swing依赖于AWT顶层容器，除此之外，Swing几乎实现了所有平台上的标准组件。
- 组件
  - 组件：组件是指构成图形界面的元素，在Java中用类表示，如按钮(JButton)、标签(JLabel)、列表(JList)和文本框(JText)等。
  - 组件分类
    - 基本组件：不包含其它组件的组件称为基本组件或者原子组件。
    - 容器组件：包含其它组件的组件称为容器组件，或简称为容器。容器又可以进一步分为顶层容器和非顶层容器(中间容器)。

### 7.2 容器

```java
public static void main(String[] args) {
    //我也不知道是啥东西，但是写上就不会出问题了
        EventQueue.invokeLater(() -> {
            //所有的框架类在这里新建
            CalculatorFrame frame=new CalculatorFrame();
        });
    }

class Frame extends JFrame
{
	//定义框架的默认像素
	private final int screenHeight；
    private final int screenWidth；
	public Frame(	)
	{
	//可选，可以获得当前屏幕的分辨率信息
	Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    screenHeight = screenSize.height;
  	screenWidth = screenSize.width;
    //设置默认的大小
    setSize(screenWidth / 4, screenHeight / 2);
    //或者使用自适应大小
    pack();
    //设置位置是否随平台改变
    setLocationByPlatform(true);
    //设置标题
    setTitle("CZY's small calculator");
    //设置关闭按钮行为
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //可见性设定，一定放在最后
    setVisible(true);
	}
	//以上内容也可以不写在构造函数中，而是通过访问对象来设置。
}
```



#### 7.2.1 顶层容器

- 默认布局管理器为BorderLayout

- JFrame：是一个带有标题行和控制按钮(最小化、恢复/最小化、关闭)的独立窗口，创建应用程序时需要使用JFrame。
- JApplet：创建小应用程序时使用JApplet，它被包含在浏览器窗口中。
- JDialog：创建对话框时使用JDialog。
- JWindow：是一个不带有标题行和控制按钮的窗口。

#### 7.2.2 内容窗格

- 每个**顶层容器**都有一个内容窗格(ContentPane)，顶层容器中除菜单之外的组件都放在这个内容窗格中。

- 将组件放进内容窗格方法：

  - 直接用frame.add()
- 使用内置的container
  
  ```java
    Container contentPane=frame.getContentPane();
    contentPane.add(button, BorderLayout.CENTER); 
  ```

- 创建新的内容窗格取代顶层容器默认的内容窗格。 

  ```java
  //创建一个JPanel实例
  JPanel contentPane=new JPanel();
  //设置JPanel实例的布局管理器
  contentPane.setLayout(new BorderLayout());
  //将Button组件实例添加到JPanel实例中
  contentPane.add(button, BorderLayout.CENTER);
  /**通过顶层容器的setContentPane方法将JPanel实例设置为新的内容窗格**/
  frame.setContentPane(contentPane); 
  ```

#### 7.2.3 面板JPanel

- 面板属于中间容器，不能独立存在但可以嵌套，面板必须被添加到其他容器内部。
- 默认布局管理器为FlowLayout

### 7.3 布局管理器

通过容器的**setLayout()**方法改变容器的布局管理器。

#### 7.3.1FlowLayout

- 对容器中组件进行布局的方式是将组件逐个地安放在容器中的一行上，一行放满后就另起一个新行。

- JPanel的默认布局管理器

- ```java
  setLayout(new FlowLayout(int align, int hgap, int vgap));
  add(button);
  ```
- align设定组件的对齐方式，取值有FlowLayout.LEFT、FlowLayout.RIGHT和FlowLayout.CENTER三种方式，分别表示左对齐、右对齐、居中。

- hgap和vgap设定组件的水平和垂直间距。

#### 7.3.2BorderLayout

- BorderLayout是顶层容器中内容窗格的默认布局管理器，每个由BorderLayout管理的容器被划分成北(North)、南(South)、西(West)、东(East)、中(Center)五个区域，在每个区域可以加入一个组件。

- ```java
  setLayout(new BorderLayout(int hgap, int vgap));
  add(button,BorderLayout.SOUTH);//组件添加位置
  ```

- hgap和vgap设定组件的水平和垂直间距。

#### 7.3.3GridLayout

- GridLayout是一种网格式的布局管理器，它将容器空间划分成若干行乘若干列的网格，组件依次放入其中，每个组件占据一格。

- ```java
  setLayout(new GridLayout(int rows, int cols, int hgap, int vgap));
  add(button)
  ```

- rows和cols分别指定网格的行数和列数。
  hgap和vgap分别表示网格间的水平间距和垂直间距。

#### 7.3.5 CardLayout

- 卡片式布局管理器，它将容器中的组件处理为一系列卡片，每一时刻只显示出其中的一张。

#### 7.3.5BoxLayout

- 它将容器中的组件按水平方向排成一行或按垂直方向排成一列。当组件排成一行时，每个组件可以有不同的宽度；当组件排成一列时，每个组件可以有不同的高度。

- ```java
  setLayout(new BoxLayoutLayout(Container target, int axis));
  add(button);
  ```

- target指明是为哪个容器设置此布局管理器；

- axis指明组件的排列方向，**BoxLayout.X_AXIS、BoxLayout.Y_AXIS**分别表示按水平方向排列和按垂直方向排列。

### 7.4 事件处理

- 事件是用户在界面上的一个操作（通常使用各种输入设备，如：鼠标、键盘等来完成）。

- 事件源：产生事件的组件叫事件源

- 事件处理器（事件处理方法）：事件处理器是一个接收事件对象并进行相应处理的方法。事件处理器包含在一个类中，这个类的对象负责检查事件是否发生，若发生就激活事件处理器进行处理。

- 事件监听器类：

  - 包含事件处理器，并负责检查事件是否发生，若发生就激活事件处理器进行处理的类叫做事件监听器类，其实例就是事件监听器对象。
  - 事件监听器类必须实现事件监听器接口或继承事件监听器适配器类。
  - 事件监听器接口定义了处理事件必须实现的方法。
  - 事件监听器适配器类是对事件监听器接口的简单实现，目的是为了减少编程的工作量。

- 注册事件监听器：必须在事件源上注册事件监听器。这是通过使用事件源组件的以下方法来完成的：
  addXxxListener（事件监听器对象）

- 事件监听器需要包括以下两部分内容

  ```java
  public class MyListener implements ActionListener
      {
  
          @Override
          public void actionPerformed(ActionEvent e)
          {
              //do something
          }
      }
     
  
  然后，在一个或多个组件上可以进行监听器类的实例的注册。如：
      组件对象.addActionListener(MyListener对象); 
  //对于只有一个动作的监听器可以用lambda表达式
  exitButton.addActionListener(event()->｛System.exit(0)});
  ```

  

### 7.5 按钮

```java
//普通按钮
Jbutton(String text, Icon icon);

//切换按钮(JToggleButton)
JToggleButton(String text, Icon icon,boolean selected默认状态);
isSelected();//判断是否被选中

//复选按钮(JCheckBox)及单选按钮(JRadioButton)
//第一个是方形的，第二个是圆形的，别的一样
//不分组可以多选，分组后组内只能单选，不同组可以多选
ButtonGroup g1=new ButtonGroup( );
JCheckBox f=new JCheckBox("f");
g1.add(f);        

```

### 7.6 复选框 **JComboBox**  

- 对于不可编辑的JComboBox，用户只在能在现有的选项列表中进行选择。

- 对于可编辑的JComboBox，用户既可以在现有选项中选择，也可以输入新的内容。

- setEditable(boolean)设置是否可编辑，默认是不可编辑的。

  ```java
  JComboBox<String> jcb1;
  String[] itemList={“One”,”Two”,”Three”,”Four”,”Five”};
  jcb1=new JComboBox(itemList);
  jcb1.setSelectedIndex(1);//选择条目
  jcb1.setVisible(true);//是否可以编辑
  jcb1.getSelectedItem().toString();//得到选择的项目
  ```

### 7.7 JList

- 列表(JList)是可供用户进行选择的一系列可选项。

  ```java
  String[] listData={“one”, “two”, “three”, “four”};
  JList jl=new JList(listData);
  ```

- 列表对象本身并不带滚动条，但是当列表可选项较多时，可将列表对象放入JScrollPane中。 

### 7.8 文本组件

```java
//创建一个文本框，其初始内容由参数text指定，首选宽度由参数columns指定，如果参数columns被设置为0，则首选宽度将是组件实现的自然结果。
JTextField(String text, int columns);
```

### 7.9 菜单组件

```java
//菜单栏是窗口中的主菜单，用来包容一组菜单。
JFrame frame=new JFrame(“Menu Demo”);
JMenuBar mb=new JMenuBar();
frame.setJMenuBar(mb); 
//菜单(JMenu)
JMenu menu1=new JMenu(“File”);
JMenu menu2=new JMenu(“Edit”);
JMenu menu3=new JMenu(“Source”);
mb.add(menu1);
mb.add(menu2);
mb.add(menu3);
//菜单项
JMenuItem mi1=new JMenuItem(“New”, KeyEvent.VK_S);
JMenuItem mi2=new JMenuItem(“Open”);
mi2.setMnemonic(KeyEvent.VK_O);//设置快捷键
JMenuItem mi3=new JMenuItem(“Close”, KeyEvent.VK_C);
menu1.add(mi1);
menu1.add(mi2);
menu1.add(mi3);
```

### 7.10 对话框

- 分为标准对话框和选择对话框
- 对话框为顶层容器，选择附着的frame
- JDialog 默认的弹出对话框
- 确认对话框(showConfirmDialog)：显示问题，要求用户确认(yes/no/cancel)。
- 输入对话框(showInputDialog)：提示用户输入。
- 信息对话框(showMessageDialog)：显示信息，告知用户发生了什么情况。
- 选项对话框(showOptionDialog)：显示选项，要求用户选择。

```java
package PPT7;

import javax.swing.*;
import java.awt.*;

public class Test3
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            MyFrame frame = new MyFrame();
        });
    }

}

class MyFrame extends JFrame
{

    JLabel text;
    public MyFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setTitle("对话框功能测试");
        add(new MyPanel(), BorderLayout.CENTER);
        add(new TextPanel(), BorderLayout.NORTH);
        //dialog();
        //add(jd); 对话框无需加入，因为他是顶层容器
        setVisible(true);

    }

    class TextPanel extends JPanel
    {
        public TextPanel()
        {
            text = new JLabel("文本显示");
            setSize(300, 200);
            add(text);

        }
    }

    class MyPanel extends JPanel
    {
        public MyPanel()
        {
            JButton b1 = new JButton("show dialog");
            JButton b2 = new JButton("showMessageDialog");
            JButton b3 = new JButton("showConfirmDialog");

            add(b1);
            add(b2);
            add(b3);

            b1.addActionListener((event) -> {
                dialog();
            });

            b2.addActionListener((event) -> {
                messageDialog();
            });
            b3.addActionListener((event) -> {
                confirmDialog();
            });
        }

        void dialog()
        {
            JDialog jd = new JDialog(MyFrame.this, "hehe", true);
            JTextField jt = new JTextField("oh yearrrrrrrrrr");
            jd.add(jt);
             //关闭该对话框进程，但不结束虚拟机
            jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           
            jd.setVisible(true);//顶层容器自己的可视化设置
            //隐藏该对话框，不关闭进程
            //jd.setDefaultCloseOperation(HIDE_ON_CLOSE);
        }

        void messageDialog()
        {
            //通过静态方法实现
            JOptionPane.showMessageDialog(MyFrame.this,
                    "这是消息对话框的内容",
                    "这是消息对话框的标题",
                    JOptionPane.ERROR_MESSAGE);
        }

        void confirmDialog()
        {
            //返回值为选择的选项
            int confirm = JOptionPane.showConfirmDialog(MyFrame.this,
                    "确认对话框信息",
                    "确认对话框标题",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            switch (confirm)
            {
                case JOptionPane.YES_OPTION:
                    text.setText("Yes");
                    break;
                case JOptionPane.NO_OPTION:
                    text.setText("NO");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    text.setText("CANCEL");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    text.setText("CLOSED");
                    break;
                default:
                    text.setText("default");

            }
        }
        
        void showInputDialog()
        {
            String[] selections = new String[]{"first", "second", "third"};
            var select=JOptionPane.showInputDialog(MyFrame.this,
                    "输入选择对话框",
                    "标题栏",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    selections,
                    selections[0]
            );
            if (select!=null)
            {
                text.setText(select.toString());
            }
            else
            {
                text.setText("closed");
            }
        }

    }
}
```

- 文件对话框（JFileChooser）

  ```java
  package PPT7;
  
  import javax.swing.*;
  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import java.io.File;
  
  public class FileChooser extends JFrame implements ActionListener
  {
      JButton open=null;
      public static void main(String[] args) {
          new FileChooser();
      }
      public FileChooser(){
          open=new JButton("open");
          this.add(open);
          this.setBounds(400, 200, 100, 100);
          this.setVisible(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          open.addActionListener(this);
      }
      @Override
      public void actionPerformed(ActionEvent e) {
          // TODO Auto-generated method stub
          JFileChooser jfc=new JFileChooser();
          jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );
          jfc.showDialog(new JLabel(), "选择");
          File file=jfc.getSelectedFile();
          if(file.isDirectory()){
              System.out.println("文件夹:"+file.getAbsolutePath());
          }else if(file.isFile()){
              System.out.println("文件:"+file.getAbsolutePath());
          }
          System.out.println(jfc.getSelectedFile().getName());
      }
  }
  
  ```

  