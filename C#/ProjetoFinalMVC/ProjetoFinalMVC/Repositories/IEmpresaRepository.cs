using ProjetoFinalMVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ProjetoFinalMVC.Repositories
{
    public interface IEmpresaRepository
    {
        void Cadastrar(Empresa empresa);
        List<Empresa> Listar();
    }
}
