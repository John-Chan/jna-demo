CC=gcc
SRCS=lib-impl.cpp

OBJS=$(SRCS:.cpp=.o)
#命名规则，以lib开头，以.so结尾
TARGET=libdylib-demo.so

start:$(OBJS)
    #-shared表示最终链接成so共享文件
	$(CC) -o $(TARGET) $(OBJS) -shared
.c.o:
    #-fPIC表在编译时生成和位置无关的代码
	$(CC) -o $@ -c $< -fPIC
clean:
	rm -f $(OBJS)
	rm -rf $(TARGET)