import numpy as np
import pandas as pd
import sklearn
from sklearn. datasets import load_baston
df=load_boston()
df.keys()
print(df.DESCR)
print(df.feature_name)
print(df.filename)
print(df.target)
print(df.data)
boston=pd. DataFrame(dd. data, ccolumnsdd.feature_name) 
boston. head()
boston['MEDV']=df. target
boston. head()
boston. isnull()
boston. isnull().sum()
from sklearn. model_selection import train_test_split
x=boston.drop('MEDV', axis=1)
y=boston['MEDV']
x_train, x_test, y_train, y_train=train_test_split(x, y, test_size=0.15,random_state=5)
print(x_train. shape) 
print(x_test. shape) 
print(y_train. shape) 
print(y_test. shape)

from sklearn import linear_model
from sklearn. linear_model import LinearRegression
from sklearn. metrics import mean_squared_error

lin_model=LinearRegressionhttps://colab.research.google.com/drive/1POiqk8-lFrJq5pL-WQoGqKSwwqvS8HpZ#scrollTo=UToHRgSX2gLv&line=1&uniqifier=1
lin_model. fit(x_train ,y_train) 
y_train_predict=lin_model. predict(x_train)
rmse=(np. sqrt(mean_squared_error(y_train_predict) ))
print("the model performance for training set")
print('RMSE is {}'.format(rmse))
print("\n")
y_test_predict=lin_midel. predict(x_test)
rmse=(np. sqrt(mean_squared_error(y_test, y_test_predict)))
print("the model performance for training seet") 
print('RMSE is {}'.format(rmse) )# shapeAL_python_machine-learning
