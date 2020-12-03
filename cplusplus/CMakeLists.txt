cmake_minimum_required(VERSION 3.5.1)
project(leetcode)

set(CMAKE_CXX_STANDARD 14)

include_directories(
        /usr/local/include
)

add_executable(leetcode hello_world.cpp)
add_executable(leetcode459 leetcode/editor/cn/[459]重复的子字符串.cpp)
add_executable(leetcode217 leetcode/editor/cn/[217]存在重复元素.cpp)
