class Individuo:
    def getAssento(self):
        return 1

class Insituicao(Individuo):
    def __innit__(self):
        self.folhas=[]

    def adicionarMembro(self, membro):
        self.folhas.append(membro)

    def getMembros(self):
        return self.folhas

class Congresso(Insituicao):
    def totalParticipantes(self):
        return len(self.folhas)+Individuo.getAssento()

    def totalAssentos(self):
        return len(self.folhas)+Individuo.getAssento()
