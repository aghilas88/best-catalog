instal java 9
sudo tar -xzf jdk-9_linux-x64_bin.tar.gz

sudo update-alternatives  --install /usr/bin/java java /home/aghilas/dev/products/jdk-9/bin/java 1000

sudo update-alternatives --install /usr/bin/javac javac /home/aghilas/dev/products/jdk-9/bin/javac 1000
sudo update-alternatives --install /usr/bin/javadoc javadoc /home/aghilas/dev/products/jdk-9/bin/javadoc 1000
sudo update-alternatives --install /usr/bin/javap javap /home/aghilas/dev/products/jdk-9/bin/javap 1000

sudo update-alternatives  --config java ///////choose java 9|raf si uniquement java9 ////////


verification : java -version


Set up Java Environment Variables

export JAVA_HOME=/home/aghilas/dev/products/jdk-9
export PATH="$PATH:$JAVA_HOME/bin"
 

file will be loaded automatically when system boots : 
source /etc/environment

instal java 8 : apt-get (OK)

maven : 
tar zxvf apache-maven-3.5.2-bin.tar.gz
modifier /etc/environment
M2_HOME="/home/aghilas/dev/products/apache-maven-3.5.2"
M2=$M2_HOME/bin
JAVA_HOME="/usr/lib/jvm/java-8-oracle"
PATH="$JAVA_HOME/bin:$M2:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games"
source /etc/environment
mvn -version

instal and use PostgreSQL : 
	sudo apt-get update
	sudo apt-get install postgresql postgresql-contrib
	utilisateur postgres : sudo -i -u postgres
	consol postgres : psql
	exit consol psql : \q
	user + consol : sudo -u postgres psql
	create user : postgres@aghilas-vm:~$ createuser --interactive >>>>>> aghilas
	create db :   postgres@aghilas-vm:~$ createdb aghilas
	la commande (aghilas@aghilas-vm:~$ psql) accede directement a la base aghilas avec le role aghilas
	connect to a different db : aghilas@aghilas-vm:~$ psql -d postgres
	check connexion : \conninfo
	change pswd : ALTER USER aghilas WITH PASSWORD 'agh';
	creation de table : sql ............
	

catalog project : 
	aghilas@aghilas-vm:~$ createdb ecom

	
