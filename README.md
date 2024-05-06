# Multi-Threaded Webserver

This Java project shows the behavior of multi-threaded and single-threaded client-server architectures. 
It is an implementation to understand the differences of each in handling client requests and server operations.

## client and server

client :computer: : A client is a program that runs on the local machine requesting service from the server. 

server :desktop_computer: : A server is a program that runs on the remote machine and provides services to the client.  Sever runs infinitely and waits for the request from the client. Upon receiving the request, it responds to the request of client.

## Thread :thread:
A thread is a smallest unit of execution within a process. Threads make concurrent execution of multiple tasks within a single process. It allows for better utilization of CPU resources and improved responsiveness in applications.

### single-threading vs Multi-threading 

Single threading : A single thread processes only one main thread. It performs tasks sequentially one after the other.

Multi-threading : the process of execution of multiple threads simutaneously is known as Multi threading.

The use of single threaded and multi threaded program is decided based upon the desing and implementation of concurrent applications.

#### Thread pool

A thread pool represents a group of threads known as worker threads that wait for the job and get used many times.

A group of fixed size threads are created and then a thread from the pool of thread is assigned a job by the service provider. After the completion of job, the thread goes to thread pool again.

