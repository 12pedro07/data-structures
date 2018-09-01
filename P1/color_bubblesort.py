import random
from p5 import *

rows = 0
cols = 0
w = 40
casas = []

def bubblesort(v, tam):
    copy = []
    for i in range(len(v[1])):
        copy.append(v[1][i].color)
    for x in range(1,tam):
        for y in range(tam-1):
            if v[1][y].color > v[1][y+1].color:
                aux = v[1][y].color
                v[1][y].change_color(v[1][y+1].color)
                v[1][y+1].change_color(aux)

            grid[x+1][y].change_color(v[1][y].color)
            grid[x+1][y-1].change_color(v[1][y-1].color)
            grid[x+1][y-2].change_color(v[1][y-2].color)
            grid[x+1][y-3].change_color(v[1][y-3].color)
            grid[x+1][y-4].change_color(v[1][y-4].color)
            grid[x+1][y-5].change_color(v[1][y-5].color)
            grid[x+1][y-6].change_color(v[1][y-6].color)
            grid[x+1][y-7].change_color(v[1][y-7].color)
            grid[x+1][y-8].change_color(v[1][y-8].color)
            grid[x+1][y-9].change_color(v[1][y-9].color)
            grid[x+1][y-10].change_color(v[1][y-10].color)
            grid[x+1][y-11].change_color(v[1][y-11].color)
    for i in range(len(copy)):
        grid[1][i].change_color(copy[i])


def setup():
    v_cores = []
    size(600, 600)
    cols = floor((width/w)-3) # Colunas (floor faz a divisao, arredonda e transforma em inteiro)
    rows = floor(height/w) # linhas
    global grid
    grid = [[] for z in range(rows)]

    for i in range(rows):
        for j in range(cols):
            global cell
            cell = Cell(i,j)
            # print(cell.i, cell.j)
            casas.append(cell)

    item = 0;
    for i in range(rows):
        for j in range(cols):
            grid[i].append(casas[item])
            item = item + 1

    bubblesort(grid,cols)

def draw():
    background(51)
    for i in range(len(casas)):
        casas[i].show()

class Cell:
    def __init__(self,i,j):
        self.i = i
        self.j = j
        if self.i == 1:
            cor = random_uniform(0,255)
        else:
            cor = 0
        self.color = cor

    def show(self):
        x = self.j*w
        y = self.i*w
        # stroke(255)
        fill(0,0,self.color) # fill( R, G, B, alpha )
        square((x,y),w)
        # no_fill()

    def change_color(self,new_color):
        self.color = new_color

run()
