# Jni 本地方法
<pre>
命令行: javac Application.java 生成 .class文件
命令行: javah Application 生成.h头文件
   编写实现文件
命令行:
   C:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin>gcc -Wl,--add-stdcall-alias -shared -o F:\gitCode\JniTree\bonaparte.o
命令行生成.dll文件
   C:\Program Files (x86)\mingw-w64\i686-8.1.0-posix-dwarf-rt_v6-rev0\mingw32\bin>gcc -Wl,--add-stdcall-alias -shared -o F:\gitCode\JniTree\bonaparte.dll F:\gitCode\JniTree\bonaparte.o
</pre>

