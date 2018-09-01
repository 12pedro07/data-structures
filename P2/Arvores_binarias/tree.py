from Node import Node
from random import randint

class tree:

    def __init__(self, tree_root):
        self.start = tree_root


    def in_order(self, current_node):
        if current_node != None:
            self.in_order(current_node.left)
            print(current_node.element)
            self.in_order(current_node.right)

    def insert_element(self, new_component):
        parent = self.start
        in_tree = False
        while (not in_tree):
            if new_component.element < parent.element:
                if parent.left == None:
                    parent.left = new_component
                    new_component.parent = parent
                    in_tree = True
                    # print("node inserted on the left")
                else:
                    parent = parent.left
            elif new_component.element > parent.element:
                if parent.right == None:
                    parent.right = new_component
                    new_component.parent = parent
                    in_tree = True
                    # print("node inserted on the right")
                else:
                    parent = parent.right
            else:
                in_tree = True
                print("can't assemble element " + str(new_component.element) + ", it is already on the tree")
