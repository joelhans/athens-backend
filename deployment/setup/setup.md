# Setup instructions


1. [Install Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
   

2. Clone repo
```
    git clone https://github.com/athensresearch/athens-backend.git
```

3. Install Java 8
```
    sudo apt update
    sudo apt install openjdk-8-jdk
```

4. Install Lein
```
    wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein -O /usr/local/bin/lein
    sudo chmod +x /usr/local/bin/lein
    lein -version
```

5. If you are running things for the first time run from inside project-dir setup.sh 
```
    cd athens-backend
    ./deployment/setup/setup.sh
```

6. Deploy(assumes running from project-dir)
```
   cd athens-backend
   ./deployment/deploy.sh 
```

#### Important Note

Tested with **ubuntu(20.04 LTS)**
