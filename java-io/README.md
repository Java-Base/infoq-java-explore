# Java深度历险（八）——Java I/O
# http://www.infoq.com/cn/articles/cf-java-i-o

# java语言提供了多个不同层次的概念来对I/O操作进行抽象
流: 是一个连续的字节的序列
输入流--读取这个序列
输出流--构建这个序列
InputStream和OutputStream所操纵的基本单元就是字节: 每次读取和写入单个字节或是字节数组.
