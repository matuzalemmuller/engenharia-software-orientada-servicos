from flask import Flask
from flask import request
from flask import Response
import mysql.connector
import json

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="",
  database="BrRobotics"
)
mycursor = mydb.cursor()

app = Flask(__name__)

def RepresentsInt(s):
    try:
        int(s)
        return True
    except ValueError:
        return False

@app.route('/BrRobotics/rest/BrRoboticsService/inserirPedido', methods = ['POST', 'GET'])
def inserirPedido():
    if request.method == 'GET':
        print(request.url)
        cliente = request.args.get('cliente', None)
        endereco = request.args.get('endereco', None)
        estado = request.args.get('estado', None)
        qtdRoboDomestico = request.args.get('qtdRoboDomestico', None)
        qtdRoboSeguranca = request.args.get('qtdRoboSeguranca', None)
        qtdRoboMedico = request.args.get('qtdRoboMedico', None)

        if cliente == None:
            data = {'erro:' : 'campo "cliente" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if endereco == None:
            data = {'erro:' : 'campo "endereco" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if estado == None:
            data = {'erro:' : 'campo "estado" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if qtdRoboDomestico == None:
            data = {'erro:' : 'campo "qtdRoboDomestico" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if qtdRoboSeguranca == None:
            data = {'erro:' : 'campo "qtdRoboSeguranca" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if qtdRoboMedico == None:
            data = {'erro:' : 'campo "qtdRoboMedico" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(cliente) != str or cliente == "":
            print(cliente)
            data = {'erro:' : 'campo "cliente" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(endereco) != str or endereco == "":
            data = {'erro:' : 'campo "endereco" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(estado) != str or estado == "":
            data = {'erro:' : 'campo "estado" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboDomestico) or qtdRoboDomestico == "":
            data = {'erro:' : 'campo "qtdRoboDomestico" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboSeguranca) or qtdRoboSeguranca == "":
            data = {'erro:' : 'campo "qtdRoboSeguranca" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboMedico) or qtdRoboMedico == "":
            data = {'erro:' : 'campo "qtdRoboMedico" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
                
        precoRoboDomestico = 900
        precoRoboSeguranca = 1800
        precoRoboMedico = 2500

        totalRoboDomestico = int(qtdRoboDomestico) * precoRoboDomestico
        totalRoboSeguranca = int(qtdRoboSeguranca) * precoRoboSeguranca
        totalRoboMedico = int(qtdRoboMedico) * precoRoboMedico
        
        total = totalRoboDomestico + totalRoboSeguranca + totalRoboMedico

        sql = "INSERT INTO PEDIDOS (CLIENTE, ENDERECO, ESTADO, QTD_ROBO_SEGURANCA, " \
                "QTD_ROBO_DOMESTICO, QTD_ROBO_MEDICO, TOTAL_ROBO_SEGURANCA, " \
                "TOTAL_ROBO_DOMESTICO, TOTAL_ROBO_MEDICO, TOTAL)" \
                "VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
        val = (cliente, endereco, estado, qtdRoboSeguranca, qtdRoboDomestico,
                qtdRoboMedico, totalRoboSeguranca,
                totalRoboDomestico, totalRoboMedico, total)
        mycursor.execute(sql, val)

        mydb.commit()

        data = {
            'codigo:' : mycursor.lastrowid,
            'cliente' : cliente,
            'endereco' : endereco,
            'estado' : estado,
            'qtdRoboDomestico' : qtdRoboDomestico,
            'qtdRoboMedico' : qtdRoboMedico,
            'qtdRoboSeguranca' : qtdRoboSeguranca,
            'totalRoboDomestico' : totalRoboDomestico,
            'totalRoboSeguranca' : totalRoboSeguranca,
            'totalRoboMedico' : totalRoboMedico,
            'total' : total
            }

        js = json.dumps(data)
        resp = Response(js, status=200, mimetype='application/json')

        print("Respondeu requisição:" + js)

        return resp


    if request.method == 'POST':
        print(request.headers)
        print(request.form.to_dict())

        cliente = request.form.get('cliente', None)
        endereco = request.form.get('endereco', None)
        estado = request.form.get('estado', None)
        qtdRoboDomestico = request.form.get('qtdRoboDomestico', None)
        qtdRoboSeguranca = request.form.get('qtdRoboSeguranca', None)
        qtdRoboMedico = request.form.get('qtdRoboMedico', None)

        if cliente == None:
            data = {'erro:' : 'campo "cliente" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if endereco == None:
            data = {'erro:' : 'campo "endereco" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if estado == None:
            data = {'erro:' : 'campo "estado" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if qtdRoboDomestico == None:
            data = {'erro:' : 'campo "qtdRoboDomestico" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if qtdRoboSeguranca == None:
            data = {'erro:' : 'campo "qtdRoboSeguranca" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
        
        if qtdRoboMedico == None:
            data = {'erro:' : 'campo "qtdRoboMedico" inexistente'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(cliente) != str or cliente == "":
            print(cliente)
            data = {'erro:' : 'campo "cliente" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(endereco) != str or endereco == "":
            data = {'erro:' : 'campo "endereco" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if type(estado) != str or estado == "":
            data = {'erro:' : 'campo "estado" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboDomestico) or qtdRoboDomestico == "":
            data = {'erro:' : 'campo "qtdRoboDomestico" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboSeguranca) or qtdRoboSeguranca == "":
            data = {'erro:' : 'campo "qtdRoboSeguranca" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp

        if not RepresentsInt(qtdRoboMedico) or qtdRoboMedico == "":
            data = {'erro:' : 'campo "qtdRoboMedico" invalido'}
            js = json.dumps(data)
            resp = Response(js, status=500, mimetype='application/json')
            return resp
                
        precoRoboDomestico = 900
        precoRoboSeguranca = 1800
        precoRoboMedico = 2500

        totalRoboDomestico = int(qtdRoboDomestico) * precoRoboDomestico
        totalRoboSeguranca = int(qtdRoboSeguranca) * precoRoboSeguranca
        totalRoboMedico = int(qtdRoboMedico) * precoRoboMedico
        
        total = totalRoboDomestico + totalRoboSeguranca + totalRoboMedico

        sql = "INSERT INTO PEDIDOS (CLIENTE, ENDERECO, ESTADO, QTD_ROBO_SEGURANCA, " \
                "QTD_ROBO_DOMESTICO, QTD_ROBO_MEDICO, TOTAL_ROBO_SEGURANCA, " \
                "TOTAL_ROBO_DOMESTICO, TOTAL_ROBO_MEDICO, TOTAL)" \
                "VALUES (%s, %s, %s, %s, %s, %s, %s, %s, %s, %s)"
        val = (cliente, endereco, estado, qtdRoboSeguranca, qtdRoboDomestico,
                qtdRoboMedico, totalRoboSeguranca,
                totalRoboDomestico, totalRoboMedico, total)
        mycursor.execute(sql, val)

        mydb.commit()

        data = {
            'codigo:' : mycursor.lastrowid,
            'cliente' : cliente,
            'endereco' : endereco,
            'estado' : estado,
            'qtdRoboDomestico' : qtdRoboDomestico,
            'qtdRoboMedico' : qtdRoboMedico,
            'qtdRoboSeguranca' : qtdRoboSeguranca,
            'totalRoboDomestico' : totalRoboDomestico,
            'totalRoboSeguranca' : totalRoboSeguranca,
            'totalRoboMedico' : totalRoboMedico,
            'total' : total
            }

        js = json.dumps(data)
        resp = Response(js, status=200, mimetype='application/json')

        print("Respondeu requisição:" + js)

        return resp

if __name__ == '__main__':
    app.run()
