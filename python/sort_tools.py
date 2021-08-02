import time
import random

def timeit(name):
    def decorator(f):
        def wrapper(*args):
            start_time = time.perf_counter_ns()
            f(args[0])
            end_time = time.perf_counter_ns()
            running_time = (end_time - start_time) / 1000000000
            print("{} sort running time: {:.7f}s".format(name, running_time))
        return wrapper
    return decorator

def build_data_set(size):
    data = []

    for i in range(1, size + 1):
        data.append(i)

    for i in range(size):
        temp = data[i]
        rand_index = random.randint(0, size - 1)
        data[i] = data[rand_index]
        data[rand_index] = temp

    return data