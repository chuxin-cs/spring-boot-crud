from flask import Flask
from flask_restful import Resource, Api

app = Flask(__name__)
api = Api(app)


"""
1、创建项目
mkdir myproject
cd myproject
py -3 -m venv .venv

2、下载依赖
pip install Flask flask-restful python-dotenv

"""


class HelloWorld(Resource):
    def get(self):
        return {'hello': 'world'}


api.add_resource(HelloWorld, '/')
