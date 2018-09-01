from random import randint
from p5 import *
from tree import tree
from Node import Node

node_list = []
for x in range(15):
    node_list.append(Node(randint(0,100)))

print("*"*50)
print("in insertion order")
[print(node_list[x].element) for x in range(len(node_list))]
print("-"*50)

print("in-order tree:")
for x in range(len(node_list)-1):
    if x == 0:
        test_tree = tree(node_list[x])
    else:
        test_tree.insert_element(node_list[x])

test_tree.in_order(test_tree.start)
test_tree.start.x = 960
test_tree.start.y = 100

print("*"*50)

def draw_children(node, cont):
    if node.left != None:
        node.left.x = node.x-100 + cont
        node.left.y = node.y+100
        no_fill()
        stroke(255)
        fill(node.left.element,node.left.element,node.left.element)
        circle((node.left.x,node.left.y), 30)
        fill(255)
        line((node.x,node.y+15), (node.left.x,node.left.y-15))

    if node.right != None:
        node.right.x = node.x+100 - cont
        node.right.y = node.y+100
        no_fill()
        stroke(255)
        fill(node.right.element,node.right.element,node.right.element)
        circle((node.right.x,node.right.y), 30)
        fill(255)
        line((node.x,node.y+15), (node.right.x,node.right.y-15))

def setup():
    size(1920, 1080)

def draw():
    cont = 0
    background(0,0,255)
    no_fill()
    stroke(255)
    fill(test_tree.start.right.element,test_tree.start.right.element,test_tree.start.right.element)
    circle((test_tree.start.x,test_tree.start.y), 30)
    for n in node_list:
        cont+=5
        draw_children(n, cont)

run()
