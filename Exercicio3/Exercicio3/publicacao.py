class Publicacao:
    def __init__(self, n, at):
        self.nome = n
        self.autor = at
    def tostring(self):
        print(self.nome)
        print(self.autor)
        

class Tree(Publicacao):
    def __init__(self, nome, at):
        self.pub = Publicacao(nome, at)
        self.left = None
        self.right = None
        if nome=='artigo':
            self.art=1
            self.publ=0
        else:
            self.art=0
            self.publ=1
    def insere(self, nome, at):
        self.pub = Publicacao(nome, at)
        if self.pub.nome == 'revistas' or 'jornais' or 'cadernos':
            self.publ = self.publ + 1
        if self.pub.nome == 'artigo':
            self.art = self.art + 1
        if self.left==None:
            self.left=Tree(nome, at)
        if self.right==None:
            self.right=Tree(nome, at)
        if self.left.pub=='artigo':#filho é um artigo
            self.right=Tree(nome, at)
        if self.right.pub=='artigo': #filho é um artigo
            self.left=Tree(nome, at)
    def getcount(self):
        print('Publicações:', self.publ-self.art)
        print('Artigos:', self.art)
    def tostring(self, Tree):
        if Tree==None:
            return
        Tree.left.pub.tostring()
        Tree.right.pub.tostring()


a = Tree('jornal', '')
a.insere('artigo', 'henrique')
a.insere('caderno', '')
a.insere('artigo', 'ana clara')
a.insere('revista', '')
a.insere('artigo', '')
a.getcount()
a.tostring(a)

