// val data = spark.read.option("inferSchema", "true").option("header", "true").option("delimiter", ",").csv(
    "https://utpl-my.sharepoint.com/:x:/r/personal/djaramillo_utpl_edu_ec/_layouts/15/Doc.aspx?sourcedoc=%7BE691BC9F-3600-4616-A164-0D3612D7960C%7D&file=owid-covid-data.csv&action=default&mobileredirect=true"
)

from pyspark.sql import SparkSession

# Crear una sesión de Spark
spark = SparkSession.builder.appName("CrearDataFrame").getOrCreate()

# Crear una lista de diccionarios con datos para las 5 columnas
datos = [
    {"nombre": "Juan", "edad": 30, "ocupacion": "Ingeniero", "ciudad": "Loja", "pais": "Ecuador"},
    {"nombre": "María", "edad": 25, "ocupacion": "Maestra", "ciudad": "Guayaquil", "pais": "Ecuador"},
    {"nombre": "Pedro", "edad": 40, "ocupacion": "Médico", "ciudad": "Quito", "pais": "Ecuador"},
    # ... agregar más datos
]

# Crear un DataFrame a partir de la lista de diccionarios
df = spark.createDataFrame(datos)

# Mostrar el DataFrame
df.show()

import pyspark.sql.functions as F
from pyspark.sql import Row

# Crear una sesión de Spark
spark = SparkSession.builder.appName("CrearDataFrame").getOrCreate()

# Crear un RDD de filas con datos para las 5 columnas
rdd = spark.sparkContext.parallelize([
    Row("Juan", 30, "Ingeniero", "Loja", "Ecuador"),
    Row("María", 25, "Maestra", "Guayaquil", "Ecuador"),
    Row("Pedro", 40, "Médico", "Quito", "Ecuador"),
    # ... agregar más datos
])

# Especificar el esquema del DataFrame (nombres y tipos de las columnas)
schema = F.struct([
    F.col("nombre", F.StringType()),
    F.col("edad", F.IntegerType()),
    F.col("ocupacion", F.StringType()),
    F.col("ciudad", F.StringType()),
    F.col("pais", F.StringType()),
])

# Crear un DataFrame a partir del RDD de filas y el esquema
df = spark.createDataFrame(rdd, schema)

# Mostrar el DataFrame
df.show()