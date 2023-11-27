**Relato de Criação e Modificação de Arquivo YAML e Gestão do Deployment**

**Passo 1: Criação do Arquivo Deployment.yaml**

Inicialmente, criei um arquivo chamado `deployment.yaml` para definir as características do meu deployment.

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: meu-deployment
spec:
  replicas: 3
  selector:
    matchLabels:
      app: minha-aplicacao
  template:
    metadata:
      labels:
        app: minha-aplicacao
    spec:
      containers:
      - name: meu-container
        image: minha-imagem:latest
        ports:
        - containerPort: 80
```

**Passo 2: Aplicação do Deployment no Cluster**

Em seguida, utilizei o comando `kubectl apply` para aplicar o arquivo YAML ao meu cluster Kubernetes:

```bash
kubectl apply -f deployment.yaml
```

Este comando envia as configurações do arquivo para o cluster, iniciando as pods conforme especificado no deployment.

**Passo 3: Verificação do Status do Deployment**

Para verificar o status do deployment e suas pods correspondentes, usei o comando:

```bash
kubectl get deployments
kubectl get pods
```

Isso me permitiu confirmar se as pods foram criadas e estão em execução conforme o esperado.

**Passo 4: Exposição do Serviço para Acesso Externo**

Após criar e aplicar o deployment, o próximo passo foi expor o serviço para permitir o acesso externo. Para isso, modifiquei o arquivo `deployment.yaml`, adicionando um serviço do tipo `NodePort`. Atualizei a seção de especificações do serviço da seguinte forma:

```yaml
apiVersion: v1
kind: Service
metadata:
  name: meu-servico
spec:
  selector:
    app: minha-aplicacao
  ports:
    - protocol: TCP
      port: 80
      targetPort: 80
  type: NodePort
```

Isso configura o serviço para escutar na porta 80 e mapear para as pods do deployment.

**Passo 5: Aplicação das Alterações do Serviço**

Apliquei as alterações do arquivo YAML do serviço usando o comando:

```bash
kubectl apply -f deployment.yaml
```

**Passo 6: Identificação da Porta NodePort Atribuída**

Para acessar externamente, identifiquei a porta NodePort atribuída ao serviço:

```bash
kubectl get service meu-servico
```

**Passo 7: Acesso Externo ao Serviço**

Com a porta NodePort identificada, pude acessar o serviço externamente usando o endereço do cluster e a porta NodePort. Por exemplo, se o IP do cluster fosse `192.168.1.100` e a porta NodePort fosse `30080`, o serviço seria acessível em `http://192.168.1.100:30080`.