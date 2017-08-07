using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fiap.HelloWorld.UI.Model
{
    class Balao : Veiculo, IVoador
    {
        //Construtor
        public Balao(string placa) : base(placa)
        {
        }

        //Metodos
        public override void Acelerar()
        {
            Console.WriteLine("Balao Acelerando");
        }

        public void Voar()
        {
            Console.WriteLine("Balao Voando");
        }
    }
}
