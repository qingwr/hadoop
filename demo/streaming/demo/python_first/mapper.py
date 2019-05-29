#!/usr/bin/python

import sys
for line in sys.stdin:
	val = line.strip()
	(year, temp) = (val[0:4],val[4:6])
	print "%s\t%s" % (year, temp)
