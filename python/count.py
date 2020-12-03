#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
# Copyright (c) 2019 aibot.me, Inc. All Rights Reserved
#

"""
File: count.py
Author: pfliu
Date: 2020/9/12
Brief: 
"""

scores = []
f = open("/tmp/tmmmmm.txt")
line = f.readline()
while line:
    scores.append(float(line))
    line = f.readline()

scores.sort()
# print(scores)

part = []
count = []
for i in range(0, 10):
    part.append(i * 1.0 / 10)
print(part)

idx = 0

tmp_c = 0
for s in scores:
    if s > part[-1]:
        break
    if s <= part[idx]:
        tmp_c += 1
    else:
        count.append(tmp_c)
        tmp_c = 1
        idx += 1
count.append(tmp_c)

for i, v in enumerate(part):
    s = ""
    if i == 0:
        s += ("[min,{0}] = {1}".format(part[i], count[i]))
    else:
        s += ("[{0},{1}] = {2}".format(part[i - 1], part[i], count[i]))
    print(s)

