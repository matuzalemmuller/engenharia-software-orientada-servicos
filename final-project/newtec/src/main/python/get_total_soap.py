import json

data = json.loads(payload)
result = data['ns2:inserirPedidoResponse']['return']['total']